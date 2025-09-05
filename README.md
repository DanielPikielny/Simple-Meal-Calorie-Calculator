# Simple-Meal-Calorie-Calculator
This is a simple Java project designed to calculate the total calories of a meal by breaking it down into individual dishes and their ingredients. The program uses a hierarchical structure where a Meal contains multiple Dish objects, and each Dish contains various Ingerdient objects. The application demonstrates object-oriented principles.

Features
Ingredient Management: The Ingerdient class stores the name and calorie count per 100 grams for a food item.

Dish Composition: The Dish class allows for the creation of dishes composed of multiple ingredients.

Calorie Calculation: The Dish class calculates the total calories of a dish based on the amount of each ingredient. The Meal class then sums the calories from all its dishes to get a total for the meal.

Meal Assembly: A Meal is composed of three distinct dishes.

Demonstration Program: The Program class serves as the main application, creating sample dishes (salad, schnitzel, chocolate balls) and a meal to demonstrate the functionality.
