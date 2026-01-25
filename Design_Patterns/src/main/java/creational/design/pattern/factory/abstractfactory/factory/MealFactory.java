package creational.design.pattern.factory.abstractfactory.factory;

import creational.design.pattern.factory.abstractfactory.abstractproduct.Burger;
import creational.design.pattern.factory.abstractfactory.abstractproduct.Drink;

public interface MealFactory {

    Burger createBurger();
    Drink CreateDrink();
}
