package apr.c2.ex2.examples;

public class Base {
    protected String name;

    public Base() {
	// llamada implicita a super -> llamada a Object
	System.out.println("Constructor por defecto para BASE");
    }

    public Base(String name) {
	this.name = name;
	System.out.println("Constructor BASE con parametro: " + name);
    }

}
