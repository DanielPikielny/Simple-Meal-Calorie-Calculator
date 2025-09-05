package q1;

import java.util.Arrays;

import Hotel.Room;

public class Dish {
	public final static int MAX_INGREDIENTS = 10;

	private String name;
	private Ingerdient[] allIngredients;
	private int[] gramsPerIngerdient; // 
	private int numOfIngredients;

	public Dish(String dishName) {
		name = dishName;
		allIngredients = new Ingerdient[MAX_INGREDIENTS];
		gramsPerIngerdient = new int [MAX_INGREDIENTS];
		numOfIngredients = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public Dish (Dish other)
	{
		if(other!=null)
		{
			name = other.name;
			Ingerdient[] allIngredients = other.allIngredients;
			int[] gramsPerIngerdient = other.gramsPerIngerdient;//@@@@@@
			numOfIngredients = other.numOfIngredients;
		}
	}

	public boolean addIngerdient(String ingredientName, int caloriesCount, int foodAmount) {
		if(this != null) {
			for (int i = 0; i < allIngredients.length; i++) {
				if(allIngredients[i] != null && allIngredients[i].getName() != null && allIngredients[i].getName() == ingredientName) {
					gramsPerIngerdient[i] += foodAmount;
					return true;
				}
			}
			if (allIngredients[MAX_INGREDIENTS-1] != null) {
				return false;
			}
		}
		int i = 0;
		while (allIngredients[i] != null) {
			i++;
		}
		allIngredients[i] = new Ingerdient(ingredientName, caloriesCount);
		gramsPerIngerdient[i] = foodAmount;
		return true;
	}

	public int calcCalories() {
		int caloriesCount = 0;
		for(int i = 0; i < allIngredients.length; i++) {
			if (allIngredients[i] == null) {
				break;
			}
			caloriesCount += (gramsPerIngerdient[i] * (allIngredients[i].getCaloriesFor100() / 100));
		}
		return caloriesCount;
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("The dish " + name + " has these ingredients:\n");
		for (int i=0 ; i< numOfIngredients ; i++) {
			str.append((i+1) + ") " + allIngredients[i] + ", " + gramsPerIngerdient[i] + "grams\n");
		}
		str.append("The dish has " + calcCalories() + " calories");
		return str.toString();
	}
}
