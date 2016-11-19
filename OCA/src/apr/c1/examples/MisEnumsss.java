package apr.c1.examples;

public enum MisEnumsss {
    // 8, 10 & 16 are passed to the constructor
    BIG(8), HUGE(10), OVERWHELMING(16) { // start a code block that defines
	// the "body" for this constant
	public String getLidCode() { // override the method
	    // defined in CoffeeSize
	    return "A";
	}
    };

    MisEnumsss(int ounces) { // constructor
	this.ounces = ounces;
    }

    private int ounces; // an instance variable

    public int getOunces() {
	return ounces;
    }
}

public enum CoffeeSize2 {
    // 8, 10 & 16 are passed to the constructor
    BIG(8), HUGE(10), OVERWHELMING(16) { // start a code block that defines
	// the "body" for this constant
	public String getLidCode() { // override the method
	    // defined in CoffeeSize
	    return "A";
	}
    };

    CoffeeSize2(int ounces) { // constructor
	this.ounces = ounces;
    }

    private int ounces; // an instance variable

    public int getOunces() {
	return ounces;
    }
}
