package apr.c3.examples;

import java.util.Date;

public class TestAsigmentPrimitives {

    byte a = 3; // No problem, 3 fits in a byte
    byte b = 8; // No problem, 8 fits in a byte
    byte c = a + b; // Should be no problem, sum of the two bytes fits in a byte
    short d = 12;
    short e = 27 + d, a+=4;

    float f = 12.1F;
    short sf = (short) f;

    public static void main(String[] args) {
	Date date;
	if (date == null) {
	    System.out.println("date is null");
	}
    }

}
