SRCDIR=src
OBJDIR=obj
EXEDIR=exe
EXT=cpp
EXE=$(EXEDIR)/server


SRCS=$(shell ls $(SRCDIR))
OBJS=$(SRCS:%.$(EXT)=%.o)
SRCFILES=$(SRCS:%=$(SRCDIR)%)
OBJFILES=$(OBJS:%=$(OBJDIR)/%)

DIRGSOAP=/opt/gsoap-2.8
FLAG= -DLINUX -g -O2
APP_INCLUDE= -I./include -I../common/include -I$(DIRGSOAP) -I$(DIRGSOAP)/gsoap -I$(DIRGSOAP)/gsoap/plugin
APP_LIBS= $(DIRGSOAP)/gsoap/libgsoap++.a -lm -lpthread
CC = g++

all: $(EXE)

$(OBJDIR)/%.o:$(SRCDIR)/%.$(EXT)
	$(CC) $(APP_INCLUDE) $(FLAG) -c $< -o $@

$(EXE) : $(OBJFILES)
	$(CC) $(FLAG) -o $(EXE) $(OBJFILES) $(APP_LIBS)


mkdir:
	@if [ -d $(EXEDIR) ]; then :; else mkdir $(EXEDIR); fi
	@if [ -d $(OBJDIR) ]; then :; else mkdir $(OBJDIR); fi
	@if [ -d $(OBJDIR) ]; then :; else mkdir include; fi
	@if [ -d $(OBJDIR) ]; then :; else mkdir test; fi
	@if [ -d $(OBJDIR) ]; then :; else mkdir xml; fi

clean:
	rm -rf *~ $(OBJDIR)/* $(EXEDIR)/* .deps/* include/* ../common/include/*.nsmap $(SRCDIR)/soap*
	@cd include;$(DIRGSOAP)/gsoap/src/soapcpp2 -pmessg -L -S -I$(DIRGSOAP)/gsoap/import:$(DIRGSOAP)/gsoap ../../common/include/messg.h;
	@\mv -f include/*.nsmap ../common/include;
	@\mv -f include/*.$(EXT) src;
	@\mv -f include/*.xml ../test;
	@\mv -f include/*.wsdl ../common/wsdl;
	@\mv -f include/*.xsd ../common/wsdl;
# echo 1 > /proc/sys/net/ipv4/tcp_tw_recycle
#	@clear


screen:
	clear
	@if [ "$(TEST)" == "SERV" ] ; then make clean; else echo "compile param : $(TEST)"; fi # make screen TEST="SERV"

