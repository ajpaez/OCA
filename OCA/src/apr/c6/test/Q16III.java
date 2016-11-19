package apr.c6.test;


public class Q16III extends Tire {
	public static void main(String[] args) {
		new Q16III().doStuff();
	}

	void doStuff() throws RuntimeException {

		System.out.println(7 / 0);
	}
}
