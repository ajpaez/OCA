package apr.c2.test;

public class Locomotive {
    Locomotive() {
	main("hi");
    }

    public static void main(String[] args) {
	System.out.print("2 ");
    }

    public static void main(String args) {
	System.out.print("3 " + args);
    }
}