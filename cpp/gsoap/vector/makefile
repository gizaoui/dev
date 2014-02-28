

all: compile


compile:
	@for mkf in server client1 client2; do \
        cd $$mkf && make -f makefile clean && make -f makefile && cd ..; \
    done

clean:
	@\rm -f ./common/include/messg.nsmap ./wsdl/*
	@for mkf in server client1 client2; do \
        cd $$mkf && make -f makefile clean && cd ..; \
    done
