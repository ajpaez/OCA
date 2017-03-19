package apr.c2.test.herencia;

public class Redwood extends Tree {

	public void go() {
		try {
			go2(new Tree(), new Redwood());// llamada OK cumple con los parametros
		} catch (ClassCastException e) {
			System.out.println("t1 IS-A tree pero t1 NOT IS-A Redwood por tanto revienta en tiempo de ejecucion");
			e.printStackTrace();
		}
		
		if (new Tree() instanceof Redwood) {
			System.out.println("OK :: un Tree nunca puede ser un Redwood");
		} else {
			System.out.println("KO :: correcto un Tree no es un Redwood");
		}

		if (new Redwood() instanceof Tree) {
			System.out.println("OK :: correcto un Redwood es un Tree");
		}

		try {
			go2((Redwood) new Tree(), new Redwood());
		} catch (ClassCastException e) {
			System.out.println("t1 IS-A tree pero t1 NOT IS-A Redwood por tanto revienta en tiempo de ejecucion");
			e.printStackTrace();
		}
		
		go2(new Redwood(), new Redwood());

	}

	public void go2(Tree t1, Redwood r1) {
		Redwood r2 = (Redwood) t1;
		Tree t2 = (Tree) r1;
	}

}
