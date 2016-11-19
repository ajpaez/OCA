package apr.c6.test;

public class Q03 {

	public static void main(String[] args) {

		try {
			int x = Integer.parseInt("two");
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}

		try {
			int x = Integer.parseInt("two");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
	}

}
