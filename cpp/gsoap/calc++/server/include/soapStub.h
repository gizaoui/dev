/* soapStub.h
   Generated by gSOAP 2.8.17r from ../../common/include/calc.h

Copyright(C) 2000-2013, Robert van Engelen, Genivia Inc. All Rights Reserved.
The generated code is released under one of the following licenses:
GPL or Genivia's license for commercial use.
This program is released under the GPL with the additional exemption that
compiling, linking, and/or using OpenSSL is allowed.
*/

#ifndef soapStub_H
#define soapStub_H
#include "stdsoap2.h"
#if GSOAP_VERSION != 20817
# error "GSOAP VERSION MISMATCH IN GENERATED CODE: PLEASE REINSTALL PACKAGE"
#endif


/******************************************************************************\
 *                                                                            *
 * Enumerations                                                               *
 *                                                                            *
\******************************************************************************/


/******************************************************************************\
 *                                                                            *
 * Types with Custom Serializers                                              *
 *                                                                            *
\******************************************************************************/


/******************************************************************************\
 *                                                                            *
 * Classes and Structs                                                        *
 *                                                                            *
\******************************************************************************/


#if 0 /* volatile type: do not declare here, declared elsewhere */

#endif

#ifndef SOAP_TYPE_ns__addResponse
#define SOAP_TYPE_ns__addResponse (10)
/* ns:addResponse */
struct ns__addResponse
{
public:
	double *result;	/* SOAP 1.2 RPC return element (when namespace qualified) */	/* optional element of type xsd:double */
public:
	int soap_type() const { return 10; } /* = unique type id SOAP_TYPE_ns__addResponse */
};
#endif

#ifndef SOAP_TYPE_ns__add
#define SOAP_TYPE_ns__add (11)
/* ns:add */
struct ns__add
{
public:
	double a;	/* required element of type xsd:double */
	double b;	/* required element of type xsd:double */
public:
	int soap_type() const { return 11; } /* = unique type id SOAP_TYPE_ns__add */
};
#endif

#ifndef SOAP_TYPE_ns__subResponse
#define SOAP_TYPE_ns__subResponse (13)
/* ns:subResponse */
struct ns__subResponse
{
public:
	double *result;	/* SOAP 1.2 RPC return element (when namespace qualified) */	/* optional element of type xsd:double */
public:
	int soap_type() const { return 13; } /* = unique type id SOAP_TYPE_ns__subResponse */
};
#endif

#ifndef SOAP_TYPE_ns__sub
#define SOAP_TYPE_ns__sub (14)
/* ns:sub */
struct ns__sub
{
public:
	double a;	/* required element of type xsd:double */
	double b;	/* required element of type xsd:double */
public:
	int soap_type() const { return 14; } /* = unique type id SOAP_TYPE_ns__sub */
};
#endif

#ifndef SOAP_TYPE_ns__mulResponse
#define SOAP_TYPE_ns__mulResponse (16)
/* ns:mulResponse */
struct ns__mulResponse
{
public:
	double *result;	/* SOAP 1.2 RPC return element (when namespace qualified) */	/* optional element of type xsd:double */
public:
	int soap_type() const { return 16; } /* = unique type id SOAP_TYPE_ns__mulResponse */
};
#endif

#ifndef SOAP_TYPE_ns__mul
#define SOAP_TYPE_ns__mul (17)
/* ns:mul */
struct ns__mul
{
public:
	double a;	/* required element of type xsd:double */
	double b;	/* required element of type xsd:double */
public:
	int soap_type() const { return 17; } /* = unique type id SOAP_TYPE_ns__mul */
};
#endif

#ifndef SOAP_TYPE_ns__divResponse
#define SOAP_TYPE_ns__divResponse (19)
/* ns:divResponse */
struct ns__divResponse
{
public:
	double *result;	/* SOAP 1.2 RPC return element (when namespace qualified) */	/* optional element of type xsd:double */
public:
	int soap_type() const { return 19; } /* = unique type id SOAP_TYPE_ns__divResponse */
};
#endif

#ifndef SOAP_TYPE_ns__div
#define SOAP_TYPE_ns__div (20)
/* ns:div */
struct ns__div
{
public:
	double a;	/* required element of type xsd:double */
	double b;	/* required element of type xsd:double */
public:
	int soap_type() const { return 20; } /* = unique type id SOAP_TYPE_ns__div */
};
#endif

#ifndef SOAP_TYPE_ns__powResponse
#define SOAP_TYPE_ns__powResponse (22)
/* ns:powResponse */
struct ns__powResponse
{
public:
	double *result;	/* SOAP 1.2 RPC return element (when namespace qualified) */	/* optional element of type xsd:double */
public:
	int soap_type() const { return 22; } /* = unique type id SOAP_TYPE_ns__powResponse */
};
#endif

#ifndef SOAP_TYPE_ns__pow
#define SOAP_TYPE_ns__pow (23)
/* ns:pow */
struct ns__pow
{
public:
	double a;	/* required element of type xsd:double */
	double b;	/* required element of type xsd:double */
public:
	int soap_type() const { return 23; } /* = unique type id SOAP_TYPE_ns__pow */
};
#endif

#ifndef WITH_NOGLOBAL

#ifndef SOAP_TYPE_SOAP_ENV__Header
#define SOAP_TYPE_SOAP_ENV__Header (24)
/* SOAP Header: */
struct SOAP_ENV__Header
{
public:
	int soap_type() const { return 24; } /* = unique type id SOAP_TYPE_SOAP_ENV__Header */
#ifdef WITH_NOEMPTYSTRUCT
private:
	char dummy;	/* dummy member to enable compilation */
#endif
};
#endif

#endif

#ifndef WITH_NOGLOBAL

#ifndef SOAP_TYPE_SOAP_ENV__Code
#define SOAP_TYPE_SOAP_ENV__Code (25)
/* SOAP Fault Code: */
struct SOAP_ENV__Code
{
public:
	char *SOAP_ENV__Value;	/* optional element of type xsd:QName */
	struct SOAP_ENV__Code *SOAP_ENV__Subcode;	/* optional element of type SOAP-ENV:Code */
public:
	int soap_type() const { return 25; } /* = unique type id SOAP_TYPE_SOAP_ENV__Code */
};
#endif

#endif

#ifndef WITH_NOGLOBAL

#ifndef SOAP_TYPE_SOAP_ENV__Detail
#define SOAP_TYPE_SOAP_ENV__Detail (27)
/* SOAP-ENV:Detail */
struct SOAP_ENV__Detail
{
public:
	char *__any;
	int __type;	/* any type of element <fault> (defined below) */
	void *fault;	/* transient */
public:
	int soap_type() const { return 27; } /* = unique type id SOAP_TYPE_SOAP_ENV__Detail */
};
#endif

#endif

#ifndef WITH_NOGLOBAL

#ifndef SOAP_TYPE_SOAP_ENV__Reason
#define SOAP_TYPE_SOAP_ENV__Reason (30)
/* SOAP-ENV:Reason */
struct SOAP_ENV__Reason
{
public:
	char *SOAP_ENV__Text;	/* optional element of type xsd:string */
public:
	int soap_type() const { return 30; } /* = unique type id SOAP_TYPE_SOAP_ENV__Reason */
};
#endif

#endif

#ifndef WITH_NOGLOBAL

#ifndef SOAP_TYPE_SOAP_ENV__Fault
#define SOAP_TYPE_SOAP_ENV__Fault (31)
/* SOAP Fault: */
struct SOAP_ENV__Fault
{
public:
	char *faultcode;	/* optional element of type xsd:QName */
	char *faultstring;	/* optional element of type xsd:string */
	char *faultactor;	/* optional element of type xsd:string */
	struct SOAP_ENV__Detail *detail;	/* optional element of type SOAP-ENV:Detail */
	struct SOAP_ENV__Code *SOAP_ENV__Code;	/* optional element of type SOAP-ENV:Code */
	struct SOAP_ENV__Reason *SOAP_ENV__Reason;	/* optional element of type SOAP-ENV:Reason */
	char *SOAP_ENV__Node;	/* optional element of type xsd:string */
	char *SOAP_ENV__Role;	/* optional element of type xsd:string */
	struct SOAP_ENV__Detail *SOAP_ENV__Detail;	/* optional element of type SOAP-ENV:Detail */
public:
	int soap_type() const { return 31; } /* = unique type id SOAP_TYPE_SOAP_ENV__Fault */
};
#endif

#endif

/******************************************************************************\
 *                                                                            *
 * Typedefs                                                                   *
 *                                                                            *
\******************************************************************************/

#ifndef SOAP_TYPE__QName
#define SOAP_TYPE__QName (5)
typedef char *_QName;
#endif

#ifndef SOAP_TYPE__XML
#define SOAP_TYPE__XML (6)
typedef char *_XML;
#endif


/******************************************************************************\
 *                                                                            *
 * Externals                                                                  *
 *                                                                            *
\******************************************************************************/


#endif

/* End of soapStub.h */
