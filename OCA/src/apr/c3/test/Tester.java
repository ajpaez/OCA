package apr.c3.test;

class Beta {
}

class Alpha {
    static Beta b1;
    Beta b2;
}

public class Tester {
    public static void main(String[] args) {
	Beta b1 = new Beta();
	Beta b2 = new Beta();
	Alpha a1 = new Alpha();
	Alpha a2 = new Alpha();
	a1.b1 = b1;
	a1.b2 = b1;
	a2.b2 = b2;
	a1 = null;
	b1 = null;
	b2 = null;
	System.out.println("do stuff");
    }
}
