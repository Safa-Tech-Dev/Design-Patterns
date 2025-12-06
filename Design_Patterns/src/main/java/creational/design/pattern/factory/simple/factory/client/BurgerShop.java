package creational.design.pattern.factory.simple.factory.client;

import creational.design.pattern.factory.simple.factory.BurgerFactory;
import creational.design.pattern.factory.simple.factory.product.Burger;

public class BurgerShop {

    public Burger prepareBurger(String type){

        Burger burger = BurgerFactory.createBurger(type);
        burger.prepareBun();
        burger.grillPatty();
        burger.addToppings();
        burger.wrap();
        return burger;
    }

    public static void main(String[] args) {

        BurgerShop shop = new BurgerShop();

        IO.println("Ordering a veggie burger");
        Burger veggieBurger = shop.prepareBurger("veggie");
        IO.println("Ordering a chicken burger");
        Burger chickenBurger = shop.prepareBurger("chicken");
        IO.println("Ordering a fish burger");
        Burger fishBurger = shop.prepareBurger("fish");

    }
}
