package apr.c6.example.bucles;

public class UsosSwitch {

	public static void main(String[] args) {
		
		//evalua la longitud de la cadena
		String s = "xyz";
		switch (s.length()) {
		case 1:
			System.out.println("length is one");
			break;
		case 2:
			System.out.println("length is two");
			break;
		case 3:
			System.out.println("length is three");
			break;
		default:
			System.out.println("no match");
		}
		
		//el compilador detecta que 128 es superior a los limites de un byte y no permite usar el valor
		byte g = 2;
		switch(g) {
		  case 23:
		  case 128:
		}
		
		//cases duplicados
		int temp = 90;
		switch(temp) {
		  case 80 :  System.out.println("80");
		  case 80 :  System.out.println("80");   // won't compile!
		  case 90 :  System.out.println("90");
		  default :  System.out.println("default");
		}
		
		// fall through 
		String ss = "green";
	    switch(ss) {
	      case "red": System.out.print("red ");
	      case "green": System.out.print("green ");
	      case "blue": System.out.print("blue ");
	      default: System.out.println("done");
	    }
	    
	    int x = 2; //someNumberBetweenOneAndTen;
	    switch (x) {
	      case 2:
	      case 4:
	      case 6:
	      case 8:
	      case 10: {
	        System.out.println("x is an even number");  break;
	      }
	    }

	    //ejemplo de fall through al no encontrar cases y lanzar el bloque default
	    int xx = 7;
	    switch (xx) {
	      case 2:  System.out.println("2");
	      default: System.out.println("default");
	      case 3: System.out.println("3");
	      case 4: System.out.println("4");
	    }
		
		
	}

}
