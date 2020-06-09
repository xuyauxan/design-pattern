package Observe1;

public class SubMealBuilderC extends MealBuilder{
    @Override
    public void BuildFood() {
        meal.setFood("Dry Pot");
    }

    @Override
    public void BuildDrinks() {

        meal.setDrinks("Yogurt");
    }
}
