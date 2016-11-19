package apr.c6.example.bucles;

public class UsosIf {

	public static void main(String[] args) {

		int x = 0, y = 0, z = 0, a = 0;

		// bad practice
		if (x > 3)
			y = 2; // esta es la unica linea del if
		z += 8;
		a = y + x;

		// ejemplo de if-elseif-else
		if (x < 300) {
			//TODO
		} else if (x < 400) {
			//TODO
		} else {
			//TODO
		}
		
		//expresiones legales para if
		int yy = 5;
		int xx = 2;
		if (((xx > 3) && (yy < 2)) | doStuff()) {
		  System.out.println("true");
		}
		
		//0 no es false, and 1 no es true
		int trueInt = 1;
		int falseInt = 0;
		if (trueInt)             // illegal
		if (trueInt == true)     // illegal
		if (1)                   // illegal
		if (falseInt == false)   // illegal
		if (trueInt == 1)        // legal
		if (falseInt == 0)       // legal
			
			
		//asignaciones en la expresion de if
		boolean boo = false;
		if (boo = true) { //evaluara true, ya que la asignacion devuelve el valor asignado}
			
		int x = 3;
		if (x = 5) { }  // Won't compile because x is not a boolean
		
	}

	private static boolean doStuff() {
		return true;

	}

}
