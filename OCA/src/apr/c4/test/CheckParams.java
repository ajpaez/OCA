package apr.c4.test;

public class CheckParams {
    public static void main(String[] args) {
	if (args.length == 1 | args[1].equals("test")) {
	    System.out.println("test case");
	} else {
	    System.out.println("production " + args[0]);
	}
    }
}
