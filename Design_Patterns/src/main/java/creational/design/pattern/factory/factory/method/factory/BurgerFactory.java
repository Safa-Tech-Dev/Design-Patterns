package creational.design.pattern.factory.factory.method.factory;


import creational.design.pattern.factory.factory.method.product.Burger;

public abstract class BurgerFactory {

    // Factory method
    protected abstract Burger createBurger();

    public void orderBurger(){

        Burger burger = createBurger();

        burger.prepareBun();
        burger.grillPatty();
        burger.addToppings();
        burger.wrap();
    }
}
