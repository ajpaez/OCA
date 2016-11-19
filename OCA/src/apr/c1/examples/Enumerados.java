package apr.c1.examples;

public class Enumerados {

    class Coffee2 {
	enum CoffeeSize {
	    BIG, HUGE, OVERWHELMING
	}

	CoffeeSize size;
    }

    public static void main(String[] args) {
	Coffee2 drink = new Coffee2();
	drink.size = Coffee2.CoffeeSize.BIG; // enclosing class
					     // name required
    }

}
