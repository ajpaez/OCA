package apr.c6.exercises;

public class Exercise6_4 {

	static String[] foods = { "apple", "potato", "meat" };

	public static void main(String[] args) {

		String[] things = { "apple", "potato", "meat", "stone", "car" };

		for (String f : things) {
			try {
				checkFood(f);
			} catch (BadFoodException e) {
				e.printStackTrace();
			}
		}

	}

	private static Boolean checkFood(String food) throws BadFoodException {
		for (String f : foods) {
			if (f.equals(food)) {
				return true;
			}
		}
		throw new BadFoodException();

	}

}
