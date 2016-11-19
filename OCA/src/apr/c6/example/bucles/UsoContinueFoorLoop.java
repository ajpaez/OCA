package apr.c6.example.bucles;

public class UsoContinueFoorLoop {

	public static void main(String[] args) {
		
		System.out.println(" ================ break in second iteration ================ ");
		for (int i = 0; i < 10; i++) {
			System.out.println("start iteration: " + (i+1) );
			if (i == 1) {
			    break;
			  }
		  System.out.println("end iteration: " + (i+1) );
		}
		
		System.out.println(" ================ continue at end of iteration ================ ");
		for (int i = 0; i < 10; i++) {
		  System.out.println("Inside loop");
		  continue;
		}
		
		System.out.println(" ================ continue when expression true ================ ");
		for (int i = 0; i < 10; i++) {
		  System.out.println("Inside loop");
		  if (doStuff() == 5) {
			 System.out.println("doStuff == 5");
		    continue;
		  }
		  // more loop code, that won't be reached when the above if test is true
		  System.out.println("end iteration");
		}
		

	}
	
	private static int doStuff(){
		return (int) (Math.random() * 10);
	}

}
