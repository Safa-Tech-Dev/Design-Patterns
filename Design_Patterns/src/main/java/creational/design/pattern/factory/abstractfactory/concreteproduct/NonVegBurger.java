package creational.design.pattern.factory.abstractfactory.concreteproduct;

import creational.design.pattern.factory.abstractfactory.abstractproduct.Burger;

public class NonVegBurger implements Burger {
    @Override
    public void prepare() {
        IO.println("Preparing Non-Veg Burger");
    }
}
