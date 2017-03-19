package apr.c2.ex2.examples;

class Employee {

	static int i = 10;
	{
		i = 15;
		System.out.print(" Employee " + i);
	}
	static {
		System.out.print(" Employee static " + i);
	}
}

class Manager extends Employee {
	static {
		i = 45;
		System.out.print(" Manager static ");
	}
	{
		i = 30;
		System.out.print(" Manager " + i);
	}
}

class Owner extends Manager {
	static {
		System.out.println("Owner");
	}
}

public class TestClass {
	public static void main(String[] args) {
		Manager m = null;
		m = new Manager();
	}
}