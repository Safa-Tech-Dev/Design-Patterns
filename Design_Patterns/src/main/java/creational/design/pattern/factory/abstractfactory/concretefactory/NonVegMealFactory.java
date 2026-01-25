package creational.design.pattern.factory.abstractfactory.concretefactory;

import creational.design.pattern.factory.abstractfactory.abstractproduct.Burger;
import creational.design.pattern.factory.abstractfactory.abstractproduct.Drink;
import creational.design.pattern.factory.abstractfactory.concreteproduct.NonVegBurger;
import creational.design.pattern.factory.abstractfactory.concreteproduct.NonVegDrink;
import creational.design.pattern.factory.abstractfactory.factory.MealFactory;

public class NonVegMealFactory implements MealFactory {
    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }

    @Override
    public Drink CreateDrink() {
        return new NonVegDrink();
    }
}
