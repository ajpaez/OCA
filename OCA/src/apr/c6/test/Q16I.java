package apr.c6.test;

class MyException extends Exception {
}

class Tire {
	void doStuff() {
	}
}

public class Q16I extends Tire {
	public static void main(String[] args) {
		new Q16I().doStuff();
	}

	void doStuff() {
		System.out.println(7 / 0);
	}
}
