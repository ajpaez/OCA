package apr.c6.test;


class SubException extends Exception { }
class SubSubException extends SubException { }


public class CC{	 
	 
	 void doStuff() throws SubException { } 
	 
	class CC2 extends CC {
		void doStuff() throws SubSubException {
		}
	}

	class CC3 extends CC {
		//An overriding method cannot throw a broader exception than the method 	it's overriding
		void doStuff() throws Exception {
		}
	}

	class CC4 extends CC {
		void doStuff(int x) throws Exception {
		}
	}

	class CC5 extends CC {
		void doStuff() {
		}
	}

}
