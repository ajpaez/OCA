package apr.c6.test;

class Infinity {
}

public class Q09 extends Infinity {

	static Integer i;

	public static void main(String[] args) {
		int sw = (int) (Math.random() * 3);
		switch (sw) {
		case 0: {//the program might hang without ever completing

			for (int x = 10; x > 5; x++)
				if (x > 10000000)
					x = 10;
			break;
		}
		case 1: {//A NullPointerException might be thrown
			int y = 7 * i;
			break;
		}
		case 2: {
			Infinity inf = new Q09();
			Q09 b = (Q09) inf;
		}
		}
	}

}
