package Observe1;

public class SubMealBuilderA extends MealBuilder {
    @Override
    public void BuildFood() {
        meal.setFood("Hamburger");
    }

    @Override
    public void BuildDrinks() {
        meal.setDrinks("coke");
    }
}

