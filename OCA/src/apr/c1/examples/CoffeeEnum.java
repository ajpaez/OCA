package apr.c1.examples;

enum CoffeeSize {
    // 8, 10 & 16 are passed to the constructor
    BIG(8), HUGE(10), OVERWHELMING(16) { // start a code block that defines
	// the "body" for this constant
	public String getLidCode() { // override the method
	    // defined in CoffeeSize
	    return "A";
	}
    };

    CoffeeSize(int ounces) { // constructor
	this.ounces = ounces;
    }

    private int ounces; // an instance variable

    public int getOunces() {
	return ounces;
    }
}

public class CoffeeEnum {
    CoffeeSize size; // each instance of Coffee has an enum

    public static void main(String[] args) {
	CoffeeEnum drink1 = new CoffeeEnum();
	drink1.size = CoffeeSize.BIG;
	CoffeeEnum drink2 = new CoffeeEnum();
	drink2.size = CoffeeSize.OVERWHELMING;
	System.out.println(drink1.size.getOunces()); // prints 8
	for (CoffeeSize cs : CoffeeSize.values())
	    System.out.println(cs + " " + cs.getOunces());
    }
}
