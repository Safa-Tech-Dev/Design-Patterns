package creational.design.pattern.factory.simple.factory.product;

/**
 * Product = Burger
 */
public interface Burger {

    void prepareBun();
    void grillPatty();
    void addToppings();
    void wrap();
}
