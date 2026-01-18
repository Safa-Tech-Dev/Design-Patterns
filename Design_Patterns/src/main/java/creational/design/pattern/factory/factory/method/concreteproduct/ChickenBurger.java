package creational.design.pattern.factory.factory.method.concreteproduct;

import creational.design.pattern.factory.factory.method.product.Burger;

public class ChickenBurger implements Burger {
    @Override
    public void prepareBun() {
        System.out.println("Preparing bun for Chicken Burger");
    }

    @Override
    public void grillPatty() {

        System.out.println("Grilling Chicken patty");
    }

    @Override
    public void addToppings() {

        System.out.println("Adding lettuce, tomato, Chicken Sauce");
    }

    @Override
    public void wrap() {

        System.out.println("Wrapping the Chicken Burger");
    }
}
