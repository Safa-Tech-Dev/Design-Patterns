package creational.design.pattern.factory.simple.factory.concreteproduct;

import creational.design.pattern.factory.simple.factory.product.Burger;

public class VegBurger implements Burger {
    @Override
    public void prepareBun() {

        System.out.println("Preparing bun for Veg Burger");
    }

    @Override
    public void grillPatty() {

        System.out.println("Grilling veggie patty");
    }

    @Override
    public void addToppings() {

        System.out.println("Adding lettuce, tomato, veggies");
    }

    @Override
    public void wrap() {

        System.out.println("Wrapping the Veg Burger");
    }
}
