

EXT=cpp
SRCDIR=src
OBJDIR=obj
CC = gcc -shared -fPIC

COM_INCLUDE= -I./include -I/home/gzaoui/Bureau/gzaoui/Documents/cpp/log4cpp-1.0/include/
COM_LIBS= -lstdc++ -lpthread -lnsl
#/usr/lib64/liblog4cpp.so.4


SRCS=$(shell ls $(SRCDIR))
OBJS=$(SRCS:%.$(EXT)=%.o)
SRCFILES=$(SRCS:%=$(SRCDIR)%)
OBJFILES=$(OBJS:%=$(OBJDIR)/%)

all: $(LIB)

$(OBJDIR)/%.o:$(SRCDIR)/%.$(EXT)
	$(CC) $(FLAG) $(COM_INCLUDE) $(INCLUDE) -c $< -o $@

$(LIB) : $(OBJFILES)
	$(CC) $(OBJFILES) $(COM_LIBS) $(LIBS) -o $(LIB)

mkdir:
	@if [ -d $(LIBDIR) ]; then :; else mkdir $(LIBDIR); fi
	@if [ -d $(OBJDIR) ]; then :; else mkdir $(OBJDIR); fi

clean:
	rm -rf *~ $(OBJDIR)/* $(LIB)

screen:
	clear

run:
	valgrind --leak-check=yes $(LIB)

# $ gdb -q ./lib/LibConfigo
# (gdb) set environment LD_PRELOAD=libefence.so.0.0
# (gdb) run

