package apr.c3.examples;

import java.util.Date;

public class TestAsigmentPrimitives {

	byte a = 3; // No problem, 3 fits in a byte
	byte b = 8; // No problem, 8 fits in a byte
	byte c = a + b; // Should be no problem, sum of the two bytes fits in a byte
	short d = 12;
	short e = 27 + d, a+=4;
	
	int i_1 = 1_000000_0;
	int i_2 = 1___0000___00;

	float f = 12.1F;
	short sf = (short) f;
	
	int firstArray[] , integer ;
	int [] array1 , array2 ;
	
	TestAsigmentPrimitives(){
		firstArray = new int[10];
		integer = 0;
		array1 = new int[10];
		array2  = new int[10];
	}

	public static void main(String[] args) {
		Date date;
		if (date == null) {
			System.out.println("date is null");
		}
	}

}
