package apr.c6.example.excepciones;

public class CheckedAndUncheckedExcepcion {

	public static void main(String[] args) {

	}

	void someMethod() {
		doStuff(); // Unhandled exception type MyException
	}

	void doStuff() throws MyException {
		try {
			throw new MyException();
		} catch (MyException me) {
			throw me;
		}
	}

	void someMethod2() {
		doStuff2();
	}

	void doStuff2() { // No need to declare an Error
		try {
			throw new Error();
		} catch (Error me) {
			throw me; // We catch it, but then rethrow it
		}
	}

}
