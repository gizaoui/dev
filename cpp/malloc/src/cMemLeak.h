/*
 * cMemLeak.h
 *
 *  Created on: 23 nov. 2019
 *      Author: https://github.com/cogu/adt/blob/master/test/CMemLeak.h
 */

#ifndef INCLUDE_CMEMLEAK_H_
#define INCLUDE_CMEMLEAK_H_

void XWBReportFinal(void);

static const char xwbProtect[] = "DeAd";
static const unsigned int xwbProtSize = sizeof(xwbProtect);

static unsigned int m_totalAlloc = 0;
static const unsigned char xwbUninit = 0x55;
static const unsigned char xwbFreed = 0xAA;

static const char xwbIMW[] = "IMW";	// Illegal memory write
static const char xwbMLK[] = "MLK"; // Memory leak
static const char xwbFNH[] = "FNH"; // Free Non Heap memory
static const char xwbFMW[] = "FMW"; // Free Memory Write

struct XWBNode {
	struct XWBNode* mPrev;
	struct XWBNode* mNext;
	void* mPtr;
	unsigned int mSize;
	const char* mFile;
	unsigned int mLine;
	const char* mName;
};

struct XWBList {

	struct XWBNode* mHead;
	struct XWBNode* mTail;

	FILE* mReport;

	unsigned long mAllocUsed;
	unsigned long mAllocTotal;
	unsigned long mAllocCurrent;

	unsigned int mFree;
	unsigned int mAllocMax;
	struct XWBNode* mNode;
	struct XWBNode* mUnused;
};

static struct XWBList xwbMem = { (struct XWBNode*) 0, (struct XWBNode*) 0, (FILE*) 0, 0, 0, 0, 0, 0, 0, 0, };

/*******************************************************************************
 * New node
 *******************************************************************************/
static struct XWBNode* XWBNodeNew(void) {
	struct XWBNode* that = (struct XWBNode*) malloc(sizeof(struct XWBNode));
	that->mPrev = 0;
	that->mNext = 0;
	that->mName = 0;
	return that;
}

/*******************************************************************************
 * Link up node
 *******************************************************************************/
static void XWBNodeLink(struct XWBNode* that, struct XWBNode* iPrev, struct XWBNode* iNext) {
	that->mPrev = iPrev;
	if (iPrev != 0) iPrev->mNext = that;
	that->mNext = iNext;
	if (iNext != 0) iNext->mPrev = that;
}

/*******************************************************************************
 * Initialization
 *******************************************************************************/
static void XWBMemNew(void) {

	xwbMem.mHead = XWBNodeNew();
	xwbMem.mTail = XWBNodeNew();
	XWBNodeLink(xwbMem.mHead, 0, xwbMem.mTail);
	XWBNodeLink(xwbMem.mTail, xwbMem.mHead, 0);

	xwbMem.mAllocUsed = 0L;
	xwbMem.mAllocTotal = 0L;
	xwbMem.mAllocCurrent = 0L;
	xwbMem.mFree = 1;

#ifdef TRCINFILE
	xwbMem.mReport = fopen(xwbReportFilename, "w");
#else
	xwbMem.mReport = 0;
#endif
	// atexit(XWBReportFinal);
}

/*******************************************************************************
 * Set up node
 *******************************************************************************/
static void XWBNodeSet(struct XWBNode* that, void* iPtr, const unsigned int iSize, const char* iFile, const unsigned int iLine) {
	that->mPtr = iPtr;
	that->mSize = iSize;
	that->mFile = iFile;
	that->mLine = iLine;
}

/*******************************************************************************
 * Insert into the tracking list
 *******************************************************************************/
void XWBMemInsert(void* iPtr, const unsigned int iSize, const char* iFile, const unsigned int iLine) {
	struct XWBNode* node;
	if (xwbMem.mHead == 0) {
		XWBMemNew();
	}

	node = XWBNodeNew();
	XWBNodeSet(node, iPtr, iSize, iFile, iLine);
	XWBNodeLink(node, xwbMem.mTail->mPrev, xwbMem.mTail);

	xwbMem.mAllocTotal += 1;
	xwbMem.mAllocCurrent += iSize;
	if (xwbMem.mAllocUsed < xwbMem.mAllocCurrent) xwbMem.mAllocUsed = xwbMem.mAllocCurrent;
}

/*******************************************************************************
 * Find a memory pointer
 *******************************************************************************/
static struct XWBNode* XWBMemFind(void* iPtr, unsigned int* oSize, const char** oFile, unsigned int* oLine) {

	struct XWBNode* result = 0;
	struct XWBNode* iter;

	iter = xwbMem.mTail;
	while ((iter = iter->mPrev) != xwbMem.mHead) {
		if (iter->mPtr == iPtr) {
			result = iter;
			*oSize = iter->mSize;
			*oFile = iter->mFile;
			*oLine = iter->mLine;
			break;
		}
	}
	return result;
}

/*******************************************************************************
 * Delete node
 *******************************************************************************/
static void XWBNodeDelete(struct XWBNode* that) {
	if (that->mPrev) that->mPrev->mNext = that->mNext;
	if (that->mNext) that->mNext->mPrev = that->mPrev;
	free(that);
}

/*******************************************************************************
 // Free a node
 *******************************************************************************/
static void XWBNodeFree(struct XWBNode* that, const char* iName, const char* iFile, const unsigned int iLine) {
	that->mFile = iFile;
	that->mLine = iLine;
	that->mName = iName;
}

// ===========================================================================================

/*******************************************************************************
 * Allocate memory
 *******************************************************************************/
void* XWBMalloc(unsigned int iSize, const char* iFile, const unsigned int iLine) {

	register unsigned int usize;
	unsigned char* result;

	usize = ((iSize + xwbProtSize) / sizeof(unsigned int) + 1) * sizeof(unsigned int);
	result = malloc(usize);
	memset(result, xwbUninit, usize);
	memcpy(&result[iSize], xwbProtect, xwbProtSize);
	m_totalAlloc += iSize;

	printf("XWBMalloc: %s(%d) malloc(%d): %p\n", iFile, iLine, iSize, result);

	XWBMemInsert(result, iSize, iFile, iLine);
	return (void*) result;
}

/*******************************************************************************
 * Allocate a number of items of a specified size
 *******************************************************************************/
void* XWBCalloc(unsigned int iNum, unsigned int iSize, const char* iFile, const unsigned int iLine) {
	void* result;
	unsigned int actual = (((iSize - 1) / sizeof(int)) + 1) * sizeof(int) * iNum;
	result = XWBMalloc(actual, iFile, iLine);
	memset(result, 0, actual);
	return result;
}

/*******************************************************************************
 * Duplicate a string
 *******************************************************************************/
char* XWBStrDup(const char* iOrig, const char* iFile, const unsigned int iLine) {
	char* result;
	result = XWBMalloc(strlen(iOrig) + 1, iFile, iLine);
	strcpy(result, iOrig);
	return result;
}

/*******************************************************************************
 * Duplicate a string
 *******************************************************************************/
char* XWBStrnDup(const char* iOrig, unsigned int iSize, const char* iFile, const unsigned int iLine) {
	char* result;
	result = XWBMalloc(iSize + 1, iFile, iLine);
	strncpy(result, iOrig, iSize);
	result[iSize] = 0;
	return result;
}

/*******************************************************************************
 * Allocate memory
 *******************************************************************************/
void* XWBRealloc(void* iPtr, unsigned int iSize, const char* iFile, const unsigned int iLine) {
	register unsigned int usize;
	unsigned char* result;
	struct XWBNode* node;
	unsigned int size, line;
	const char* name;

	usize = ((iSize + xwbProtSize) / sizeof(unsigned int) + 1) * sizeof(unsigned int);
	result = realloc(iPtr, usize);

	memcpy(&result[iSize], xwbProtect, xwbProtSize);

	name = iFile;
	line = iLine;
	node = XWBMemFind(iPtr, &size, &name, &line);
	if (node == 0) {
		XWBMemInsert(result, iSize, iFile, iLine);
	}
	else {
		XWBNodeSet(node, result, iSize, name, line);
		xwbMem.mAllocCurrent -= size;
		xwbMem.mAllocCurrent += iSize;
		if (xwbMem.mAllocUsed < xwbMem.mAllocCurrent) xwbMem.mAllocUsed = xwbMem.mAllocCurrent;
	}
	return (void*) result;
}

/*******************************************************************************
 * Unallocate memory
 *******************************************************************************/
void XWBFree(void* iPtr, const char* iDesc, const char* iFile, const unsigned int iLine) {

	const char* file;
	unsigned int line;
	unsigned int size;
	struct XWBNode* node;

	node = XWBMemFind(iPtr, &size, &file, &line);

	if (node != 0) {
		unsigned char* ptr = (unsigned char*) iPtr;
		if (memcmp(&ptr[size], xwbProtect, xwbProtSize) != 0) {
#ifdef TRCINFILE
			fprintf(xwbMem.mReport, "%s: %s allocated %s: %u\n", xwbIMW, iDesc, file, line);
			fprintf(xwbMem.mReport, "   : %s deallocated %s: %u\n", iDesc, iFile, iLine);
#else
			printf("%s: %s allocated %s: %u\n", xwbIMW, iDesc, file, line);
			printf("   : %s deallocated %s: %u\n", iDesc, iFile, iLine);
#endif
		}

		memset(iPtr, xwbFreed, size);

		if (xwbMem.mFree) {
			free(iPtr);
			XWBNodeDelete(node);
		}
		else {
			XWBNodeFree(node, iDesc, iFile, iLine);
		}
		xwbMem.mAllocCurrent -= size;
	}
	else {
#ifdef TRCINFILE
		fprintf(xwbMem.mReport, "%s: %s deallocated %s: %u\n", xwbFNH, iDesc, iFile, iLine);
#else
		printf("%s: %s deallocated %s: %u\n", xwbFNH, iDesc, iFile, iLine);
#endif
	}
}

/*******************************************************************************
 * Do not free
 *******************************************************************************/
void XWBNoFree(void) {
	if (xwbMem.mHead == 0) {
		XWBMemNew();
	}
	xwbMem.mFree = 0;
}

/*******************************************************************************
 * Report
 *******************************************************************************/
void XWBReport(const char* iTag) {
	struct XWBNode* iter;
	unsigned char* ptr;
	unsigned int size;
	register unsigned int u;

	if (xwbMem.mHead == 0) {
		XWBMemNew();
	}

	if (iTag) {
#ifdef TRCINFILE
		fprintf(xwbMem.mReport, "\n%s\n", iTag);
#else
		printf("\n%s\n", iTag);
#endif
	}

	iter = xwbMem.mHead;
	while ((iter = iter->mNext) != xwbMem.mTail) {
		ptr = (unsigned char*) iter->mPtr;
		size = iter->mSize;
		if (iter->mName) {
			for (u = 0; u < size; u++) {
				if (ptr[u] != xwbFreed) {
#ifdef TRCINFILE
					fprintf(xwbMem.mReport, "%s: %s freed at %s: %u\n", xwbFMW, iter->mName, iter->mFile, iter->mLine);
#else
					printf("%s: %s freed at %s: %u\n", xwbFMW, iter->mName, iter->mFile, iter->mLine);
#endif
					break;
				}
			}
		}
		else {
#ifdef TRCINFILE
			fprintf(xwbMem.mReport, "%s: %p %u bytes allocated %s: %u\n", xwbMLK, iter->mPtr, iter->mSize, iter->mFile, iter->mLine);
#else
			printf("%s: %p %u bytes allocated %s: %u\n", xwbMLK, iter->mPtr, iter->mSize, iter->mFile, iter->mLine);
#endif
			if (memcmp(&ptr[size], xwbProtect, xwbProtSize) != 0) {
#ifdef TRCINFILE
				fprintf(xwbMem.mReport, "%s: %p allocated %s: %u\n", xwbIMW, ptr, iter->mFile, iter->mLine);
#else
				printf("%s: %p allocated %s: %u\n", xwbIMW, ptr, iter->mFile, iter->mLine);
#endif
			}
		}
	}

#ifdef TRCINFILE
	fprintf(xwbMem.mReport, "Total allocations    : %ld\n", xwbMem.mAllocTotal);
	fprintf(xwbMem.mReport, "Max memory allocation: %ld (%luK)\n", xwbMem.mAllocUsed, xwbMem.mAllocUsed / 1024);
	fprintf(xwbMem.mReport, "Total leak           : %ld\n\n", xwbMem.mAllocCurrent);
#else
	printf("Total allocations    : %ld\n", xwbMem.mAllocTotal);
	printf("Max memory allocation: %ld (%luK)\n", xwbMem.mAllocUsed, xwbMem.mAllocUsed / 1024);
	printf("Total leak           : %ld\n\n", xwbMem.mAllocCurrent);
#endif

}

/*******************************************************************************
 * Final Report
 *******************************************************************************/
void XWBReportFinal(void) {
	XWBReport("============= Final Report =============");
#ifdef TRCINFILE
	fclose(xwbMem.mReport);
#endif
	xwbMem.mReport = 0;
}

#undef malloc
#define malloc(x) XWBMalloc((x), __FILE__, __LINE__)

#undef calloc
#define calloc(num,size) XWBCalloc((num), (size), __FILE__, __LINE__)

#undef _strdup
#undef strdup
#define strdup(x) XWBStrDup(x, __FILE__, __LINE__)

#undef strndup
#define strndup(x,size) XWBStrnDup(x,(size), __FILE__, __LINE__)

#undef realloc
#define realloc(x,size) XWBRealloc(x,(size),__FILE__,__LINE__)

#undef free
#define free(x)   XWBFree(x, #x, __FILE__, __LINE__)

#endif /* INCLUDE_CMEMLEAK_H_ */

/* ========================================================
 *                         EXEMPLE
 * ========================================================
 
 #include <stdio.h>
 #include <stdlib.h>
 #include <string.h>
 #include <malloc.h>
 #include <assert.h>


 #define MEMLEAK
 #ifdef MEMLEAK
 // #define TRCINFILE
 #ifdef TRCINFILE
 static const char xwbReportFilename[] = "CMemLeak.txt";
 #endif
 #include "include/cMemLeak.h"
 #endif

 int main(int argc, char **argv) {
 
   cJSON *dummyJSON=NULL;
   cJSON_Hooks *myHookMethods=NULL;
   const char *dummyStr = "{\"please_parse_me\":\"Okay\"}";
	
   printf("START %d\n", (10 * sizeof(double)));
   
   double* tst = (double*) malloc(10 * sizeof(double));
   double* tst2 = (double*) calloc(10, sizeof(double));
   free(tst);
   free(tst2);
   
   
   // Gestion des "memory leak" cJSON
   // https://tonyzhaoroadtoglory.wordpress.com/function-pointer-in-cc-sdk/
   myHookMethods = (cJSON_Hooks *) malloc(sizeof(cJSON_Hooks));
   myHookMethods->malloc_fn = selfdefMallocMethod;
   myHookMethods->free_fn = selfdefFreeMethod;
   cJSON_InitHooks(myHookMethods);
   dummyJSON = cJSON_Parse(dummyStr);
   cJSON_Delete(dummyJSON);
   free(myHookMethods);
	

 #ifdef MEMLEAK
   XWBReportFinal();
 #endif

  return 0;
 }

 * ======================================================== */
