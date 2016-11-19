package apr.c6.exercises;

public class Exercise6_3 {

	public static void main(String[] args) {
		
		String [] palabras = { "antonio", "java", ""};
		
		for (String p : palabras){		
			try {
				System.out.println(reverse(p));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println("palabra invertida");
			}
		}
	}

	static String reverse(String s) throws Exception {

		if (s.length() == 0) {
			throw new Exception("Longitud cero");
		}

		String reverseStr = "";
		for (int i = s.length() - 1; i >= 0; --i) {
			reverseStr += s.charAt(i);
		}
		return reverseStr;
	}

}
