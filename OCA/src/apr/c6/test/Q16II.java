package apr.c6.test;


public class Q16II extends Tire {
	public static void main(String[] args) {
		new Q16II().doStuff();
	}

	void doStuff() throws MyException {
		System.out.println(7 / 0);
	}
}
