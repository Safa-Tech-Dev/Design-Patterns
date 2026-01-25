package creational.design.pattern.factory.abstractfactory.client;

import creational.design.pattern.factory.abstractfactory.abstractproduct.Burger;
import creational.design.pattern.factory.abstractfactory.abstractproduct.Drink;
import creational.design.pattern.factory.abstractfactory.factory.MealFactory;

public class Restaurant {

    private Burger burger;
    private Drink drink;

    public Restaurant(MealFactory mealFactory) {
        this.burger = mealFactory.createBurger();
        this.drink = mealFactory.CreateDrink();
    }

    void serveMeal(){
        burger.prepare();
        drink.pour();
    }
}
