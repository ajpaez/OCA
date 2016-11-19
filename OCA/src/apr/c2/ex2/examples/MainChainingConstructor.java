package apr.c2.ex2.examples;

public class MainChainingConstructor {

    public static void main(String[] args) {

	System.out.println("--Instanciando una clase derivada CON parametro--");
	Derived sub = new Derived("Derivada");

	System.out.println("--Instanciando una clase derivada SIN parametro--");
	Derived sub2 = new Derived();
    }

}
