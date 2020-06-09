package Observe1;

public class SubMealBuilderB extends MealBuilder{
    @Override
    public void BuildFood() {
        meal.setFood("Hot Pot");
    }

    @Override
    public void BuildDrinks() {
        meal.setDrinks("sweet-sour plum juice");
    }
}
