package apr.c2.test;

class Bird {
    {
	System.out.print("b1 ");
    }

    public Bird() {
	System.out.print("b2 ");
    }
}

class Raptor extends Bird {
    static {
	System.out.print("r1 ");
    }

    public Raptor() {
	System.out.print("r2 ");
    }

    {
	System.out.print("r3 ");
    }
    static {
	System.out.print("r4 ");
    }
}

class Hawk extends Raptor {
    public static void main(String[] args) {
	System.out.print("pre ");
	new Hawk();
	System.out.println("hawk ");
    }
}
