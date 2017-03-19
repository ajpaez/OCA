package apr.c2.ex2.examples;

public class InitTest{
	   static String s1 = sM1("a");{
	      s1 = sM1("b");
	   }
	   static{
	      s1 = sM1("c");
	   }
	   
	   static {
			System.out.println("Bloque init static");
		    }

		    {
			System.out.println("Bloque init instantion");
		    }
		    
		    
	   public static void main(String args[]){
	      InitTest it = new InitTest();
	   }
	   private static String sM1(String s){
	      System.out.println(s);  return s;
	   }
	}
