package apr.c2.ex2.examples;

public class FrogEstaticos {

    static int frogCount = 0; // Declare and initialize
			      // static variable

    public FrogEstaticos() {
	frogCount += 1; // Modify the value in the constructor
    }

    public static void main(String[] args) {
	new FrogEstaticos();
	new FrogEstaticos();
	new FrogEstaticos();
	System.out.println("Frog count is now " + frogCount);
    }

}
