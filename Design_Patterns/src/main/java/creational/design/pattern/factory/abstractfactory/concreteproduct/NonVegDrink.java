package creational.design.pattern.factory.abstractfactory.concreteproduct;

import creational.design.pattern.factory.abstractfactory.abstractproduct.Drink;

public class NonVegDrink implements Drink {
    @Override
    public void pour() {
        IO.println("Pouring Non-Veg Drink");
    }
}
