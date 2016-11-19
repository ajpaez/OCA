package apr.c6.exercises;

public class Exercise6_2 {
	public static void main(String[] args) {
		int age = 0;

		outer: while (age <= 21) {
			if (age == 16) {
				System.out.println("Now that you are " + age + " years old, get your driver's license.");
				age++;
				continue outer;
			}
			System.out.println("Another year older, your current age is: " + age);
			age++;
		}

	}
}
