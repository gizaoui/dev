

SRCDIR=src
OBJDIR=obj
EXEDIR=exe
EXT=cpp
EXE=$(EXEDIR)/main


SRCS=$(shell ls $(SRCDIR))
OBJS=$(SRCS:%.$(EXT)=%.o)
SRCFILES=$(SRCS:%=$(SRCDIR)%)
OBJFILES=$(OBJS:%=$(OBJDIR)/%)

FLAG= -g
APP_INCLUDE= -I./include
APP_LIBS= -lstdc++
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

# $ gdb -q ./exe/main
# (gdb) set environment LD_PRELOAD=libefence.so.0.0
# (gdb) run

