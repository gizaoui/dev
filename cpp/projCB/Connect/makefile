

SRCDIR=src
OBJDIR=obj
EXEDIR=exe
EXT=cpp
EXE=$(EXEDIR)/server


SRCS=$(shell ls $(SRCDIR))
OBJS=$(SRCS:%.$(EXT)=%.o)
SRCFILES=$(SRCS:%=$(SRCDIR)%)
OBJFILES=$(OBJS:%=$(OBJDIR)/%)

FLAG= -g
APP_INCLUDE= -I./include -I../Tools/include -I../SipsConfig/include -I../Parser/include -I/home/gzaoui/Bureau/gzaoui/Documents/cpp/log4cpp-1.0/include/
APP_LIBS= ../lib/libTools.so ../lib/libConfig.so ../lib/libParser.so -lstdc++ -lpthread -lnsl /usr/lib64/liblog4cpp.so.4
CC = gcc

all: $(EXE)

$(OBJDIR)/%.o:$(SRCDIR)/%.$(EXT)
	$(CC) $(FLAG) $(APP_INCLUDE) -c $< -o $@

$(EXE) : $(OBJFILES)
	$(CC) $(OBJFILES) $(APP_LIBS) -o $(EXE)

mkdir:
	@if [ -d $(EXEDIR) ]; then :; else mkdir $(EXEDIR); fi
	@if [ -d $(OBJDIR) ]; then :; else mkdir $(OBJDIR); fi

clean:
	rm -rf *~ $(OBJDIR)/* $(EXEDIR)/*

screen:
	clear

run:
	valgrind --leak-check=yes $(EXE)

# $ gdb -q ./exe/server
# (gdb) set environment LD_PRELOAD=libefence.so.0.0
# (gdb) run

