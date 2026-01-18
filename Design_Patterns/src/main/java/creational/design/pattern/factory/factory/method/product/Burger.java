package creational.design.pattern.factory.factory.method.product;

/**
 * Product = Burger
 */
public interface Burger {

    void prepareBun();
    void grillPatty();
    void addToppings();
    void wrap();
}
