package apr.c3.examples;

public class Main {

    static Boolean conectado = false;

    public static void main(String[] args) {
	ThreadB b = new ThreadB();
	b.start();

	synchronized (conectado) {
	    try {
		System.out.println("Waiting for b to complete...");
		conectado.wait();
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	    System.out.println("Total is: " + b.total);
	}
    }
}

class ThreadB extends Thread {
    int total = 0;

    @Override
    public void run() {
	synchronized (Main.conectado) {
	    try {
		Thread.sleep(5000);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    for (int i = 0; i < 100; i++) {
		total += i;
	    }
	    Main.conectado.notify();
	}
    }
}
