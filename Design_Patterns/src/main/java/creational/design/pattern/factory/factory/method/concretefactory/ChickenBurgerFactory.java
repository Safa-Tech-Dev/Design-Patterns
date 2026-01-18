package creational.design.pattern.factory.factory.method.concretefactory;

import creational.design.pattern.factory.factory.method.concreteproduct.ChickenBurger;
import creational.design.pattern.factory.factory.method.factory.BurgerFactory;
import creational.design.pattern.factory.factory.method.product.Burger;

public class ChickenBurgerFactory extends BurgerFactory {
    @Override
    protected Burger createBurger() {
        return new ChickenBurger();

    }
}
