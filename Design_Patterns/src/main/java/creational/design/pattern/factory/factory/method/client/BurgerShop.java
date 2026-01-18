package creational.design.pattern.factory.factory.method.client;

import creational.design.pattern.factory.factory.method.concretefactory.ChickenBurgerFactory;
import creational.design.pattern.factory.factory.method.concretefactory.FishBurgerFactory;
import creational.design.pattern.factory.factory.method.concretefactory.VegBurgerFactory;
import creational.design.pattern.factory.factory.method.factory.BurgerFactory;
import creational.design.pattern.factory.factory.method.product.Burger;

public class BurgerShop {


    public static void main(String[] args) {


        IO.println("Ordering a veggie burger");
        BurgerFactory veggieBurger = new VegBurgerFactory();
        veggieBurger.orderBurger();
        IO.println("========================================");

        IO.println("Ordering a chicken burger");
        BurgerFactory chickenBurger = new ChickenBurgerFactory();
        chickenBurger.orderBurger();
        IO.println("========================================");

        IO.println("Ordering a fish burger");
        BurgerFactory fishBurger = new FishBurgerFactory();
        fishBurger.orderBurger();

    }
}
