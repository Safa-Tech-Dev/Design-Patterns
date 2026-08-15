package structural.design.pattern.decorator;

// Mushroom Decorator
public class MushroomDecorator extends PizzaDecorator{

    MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        // Return the wrapped pizza's cost + 25
        return super.getCost() + 25;
    }

    @Override
    public String getDescription() {
        // Return the wrapped pizza's description + ", Mushroom"
        return super.getDescription() +", Mushroom";
    }
}
