EXENAME=main

SRCDIR=src
OBJDIR=obj
EXEDIR=exe
EXT=C

SRCS=$(shell ls $(SRCDIR))
OBJS=$(SRCS:%.$(EXT)=%.o)
SRCFILES=$(SRCS:%=$(SRCDIR)%)
OBJFILES=$(OBJS:%=$(OBJDIR)/%)

FLAG=
APP_INCLUDE= -I./include
APP_LIBS=
CC = g++

all: $(EXEDIR)/$(EXENAME)

$(OBJDIR)/%.o:$(SRCDIR)/%.$(EXT)
	$(CC) $(FLAG) $(APP_INCLUDE) -c $< -o $@

$(EXEDIR)/$(EXENAME): $(OBJFILES)
	$(CC) $(OBJFILES) $(APP_LIBS) -o $(EXEDIR)/$(EXENAME)

mkdir:
	@if [ -d $(EXEDIR) ]; then :; else mkdir $(EXEDIR); fi
	@if [ -d $(OBJDIR) ]; then :; else mkdir $(OBJDIR); fi

clean:
	rm -rf *~ $(OBJDIR)/* $(EXEDIR)/*

screen:
	clear
