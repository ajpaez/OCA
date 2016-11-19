package apr.c2.ex2.examples;

public class Derived extends Base {

    static {
	System.out.println("Bloque init static en Derivada");
    }

    {
	System.out.println("Bloque init instantion en Derivada");
    }

    public Derived() {
	// llamada implicita a super
	System.out.println("Constructor por defecto para Derivada");
    }

    public Derived(String name) {
	super(name); // llamada explicita a super
	System.out.println("Constructor Derivada con parametro: " + name);
    }
}
