package apr.c6.example.bucles;

public class BuclesEtiquetados {
	public static void main(String[] args) {

		System.out.println(" ================ bucle etiquetado con break ================ ");
		boolean isTrue = true;
		outer1: for (int i = 0; i < 5; i++) {
			while (isTrue) {
				System.out.println("Hello");
				break outer1;
			} // end of inner while loop
			System.out.println("Outer loop."); // Won't print
		} // end of outer for loop
		System.out.println("Good-Bye");
		
		

		System.out.println(" ================ bucle etiquetado con continue ================ ");
		outer2: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5;) {
				System.out.println("Hello");
				continue outer2;
			} // end of inner loop
			System.out.println("outer"); // Never prints
		}
		System.out.println("Good-Bye");

	}

}
