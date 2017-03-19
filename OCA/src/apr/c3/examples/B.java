package apr.c3.examples;

public class B extends A {
	int i = 4;

	public static void main(String[] args) {
		A a = new B();
		a.print();

	}

	void print() {
		System.out.println(i);
	}
}

class A {
	A() {
		print();
	}

	void print() {
		System.out.println("A");
	}
}
