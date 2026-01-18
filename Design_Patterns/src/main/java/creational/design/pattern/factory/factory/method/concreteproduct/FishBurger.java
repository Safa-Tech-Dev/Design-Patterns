package creational.design.pattern.factory.factory.method.concreteproduct;

import creational.design.pattern.factory.factory.method.product.Burger;

public class FishBurger implements Burger {
    @Override
    public void prepareBun() {
        System.out.println("Preparing bun for Fish Burger");
    }

    @Override
    public void grillPatty() {

        System.out.println("Grilling Fish patty");
    }

    @Override
    public void addToppings() {

        System.out.println("Adding lettuce, tomato");
    }

    @Override
    public void wrap() {

        System.out.println("Wrapping the Fish Burger");
    }
}
