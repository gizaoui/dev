

all: compile


compile:
	@for mkf in server client; do \
        cd $$mkf && make -f makefile clean && make -f makefile && cd ..; \
    done

clean:
	@for mkf in server client; do \
        cd $$mkf && make -f makefile clean && cd ..; \
    done
