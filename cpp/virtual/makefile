EXENAME=main

SRCDIR=src
INCDIR=include
OBJDIR=obj
EXEDIR=exe
EXT=C

SRCS2=$(shell ls $(SRCDIR)/*.$(EXT))
SRCS=$(SRCS2:$(SRCDIR)/%=%)
OBJS=$(SRCS:%.$(EXT)=%.o)
SRCFILES=$(SRCS:%=$(SRCDIR)/%)
OBJFILES=$(OBJS:%=$(OBJDIR)/%)


FLAG= -Wno-deprecated
APP_INCLUDE= -I./$(INCDIR)
APP_LIBS= -lstdc++
CC = gcc

all: $(EXEDIR)/$(EXENAME)

$(OBJDIR)/%.o:$(SRCDIR)/%.$(EXT)
	$(CC) $(FLAG) $(APP_INCLUDE) -c $< -o $@

$(EXEDIR)/$(EXENAME) : $(OBJFILES)
	$(CC) $(OBJFILES) $(APP_LIBS) -o $(EXEDIR)/$(EXENAME)

mkdir:
	@if [ -d $(EXEDIR) ]; then :; else mkdir $(EXEDIR); fi
	@if [ -d $(OBJDIR) ]; then :; else mkdir $(OBJDIR); fi

clean:
	rm -f *~ $(OBJDIR)/* $(EXEDIR)/* $(SRCDIR)/*~ $(SRCDIR)/*~

