package apr.c6.test;

public class Q11 {

	static String s = "";

	public static void main(String[] args) {
		try {
			s += "1";
			throw new Exception();
		} catch (Exception e) {
			s += "2";
		} finally {
			s += "3"; 
			doStuff(); //An exception is thrown with no other output java.lang.ArithmeticException: / by zero
			s += "4";
		}
		System.out.println(s);
	}

	static void doStuff() {
		int x = 0;
		int y = 7 / x;
	}

}
