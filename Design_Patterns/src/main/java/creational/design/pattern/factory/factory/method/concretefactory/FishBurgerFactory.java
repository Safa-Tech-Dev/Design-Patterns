package creational.design.pattern.factory.factory.method.concretefactory;

import creational.design.pattern.factory.factory.method.concreteproduct.FishBurger;
import creational.design.pattern.factory.factory.method.factory.BurgerFactory;
import creational.design.pattern.factory.factory.method.product.Burger;

public class FishBurgerFactory extends BurgerFactory {

    @Override
    protected Burger createBurger(){

        return new FishBurger();
    }
}
