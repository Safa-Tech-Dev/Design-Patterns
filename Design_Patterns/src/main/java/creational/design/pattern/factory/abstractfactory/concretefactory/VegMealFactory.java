package creational.design.pattern.factory.abstractfactory.concretefactory;

import creational.design.pattern.factory.abstractfactory.abstractproduct.Burger;
import creational.design.pattern.factory.abstractfactory.abstractproduct.Drink;
import creational.design.pattern.factory.abstractfactory.concreteproduct.VegBurger;
import creational.design.pattern.factory.abstractfactory.concreteproduct.VegDrink;
import creational.design.pattern.factory.abstractfactory.factory.MealFactory;

public class VegMealFactory implements MealFactory {
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }

    @Override
    public Drink CreateDrink() {
        return new VegDrink();
    }
}
