package apr.c3.test;

public class Scope {

    public static void main(String[] args) {

	int ouch = 0;
	new Scope().methodScope(ouch);
	new Scope().ifScope(ouch);
	new Scope().switchScope();
	System.out.print(" " + ouch);

    }

    private void ifScope(int ouch) {
	ouch++;
	if (1 == 1) {
	    int ouch = 1;// variable duplicada con el parametro
	}

	System.out.print(" " + ouch);
    }

    private void methodScope(int ouch) {
	ouch++;
	for (int ouch = 3; ouch < 6; ouch++) {// variable duplicada con el
					      // parametro
	}
	System.out.print(" " + ouch);
    }

    private String switchScope() {
	int key = 2;
	switch (key) {
	case 1: {
	    String str = "1";
	    return str;
	}
	case 2: {
	    String str = "2";
	    return str;
	}
	}
	return null;
    }

}
