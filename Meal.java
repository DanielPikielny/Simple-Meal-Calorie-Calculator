package q1;

public class Meal {
	public final static int NUM_OF_DISHES = 3;
	
	private Dish[] allDishes;
	
	public Meal(Dish dish1, Dish dish2, Dish dish3) {
		allDishes = new Dish[NUM_OF_DISHES];
		allDishes[0] = dish1;
		allDishes[1] = dish2;
		allDishes[2] = dish3;
	}
	
	public int calcCalories() {
		int sum = 0;
		for (int i=0 ; i < allDishes.length ; i++) {
			sum += allDishes[i].calcCalories();
		}
		return sum;
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer("Meal has these ingredients:\n");
		for (int i=0 ; i< NUM_OF_DISHES ; i++) {
			str.append((i+1) + ") " + allDishes[i].toString() + "\n");
		}
		str.append("The meal has " + calcCalories() + " calories");
		return str.toString();
	}
}