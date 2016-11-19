package apr.c6.example.excepciones;

public class TryCatchBasic {
	
	public static void main(String[] args) {
		
		//try seguido de finally
		try {
		  // do stuff
		} finally {
		  // clean up
		}

		//try con un catch y seguido de finally
		try {
		  // do stuff
		} catch (Exception ex) {
		  // do exception handling
		} finally {
		  // clean up
		}

		//Try con errores, NO puede ir solo
		try {
		  // do stuff
		}
		  // need a catch or finally here
		System.out.println("out of try block");


		// Try con errores, NO se puede insertar código entre try y un bloque catch o finally
		try {
		  // do stuff
		}
		// can't have code between try/catch
		System.out.println("out of try block");
		catch(Exception ex) { }
		
		
	}

}
