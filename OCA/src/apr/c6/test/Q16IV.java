package apr.c6.test;


public class Q16IV extends Tire {
	public static void main(String[] args) {
		new Q16IV().doStuff();
	}

	void doStuff() throws ArithmeticException{
		System.out.println(7 / 0);
	}
}
