package apr.c6.test;

public class Q14 {

	public static void main(String[] args) {

		String s = "bob";
		String[] sa = { "a", "bob" };
		final String s2 = "bob";
		StringBuilder sb = new StringBuilder("bob");
		switch (sa[1]) { // line 1
		case "ann":
			; // line 4
		case s:
			; // line 5
		case s2:
			; // line 6
		}
		switch ("b" + "ob") { // line 2

		}
		switch (sb.toString()) { // line 3

		}

	}

}
