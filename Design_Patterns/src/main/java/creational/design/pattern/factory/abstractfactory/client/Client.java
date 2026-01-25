package creational.design.pattern.factory.abstractfactory.client;

import creational.design.pattern.factory.abstractfactory.concretefactory.NonVegMealFactory;
import creational.design.pattern.factory.abstractfactory.concretefactory.VegMealFactory;
import creational.design.pattern.factory.abstractfactory.factory.MealFactory;

public class Client {

    static void main() {

        MealFactory vegMealFactory = new VegMealFactory();
        Restaurant vegRestaurant = new Restaurant(vegMealFactory);
        vegRestaurant.serveMeal();

        IO.println("==================================================");

        MealFactory nonVegMealFactory = new NonVegMealFactory();
        Restaurant nonVegRestaurant = new Restaurant(nonVegMealFactory);
        nonVegRestaurant.serveMeal();
    }
}
