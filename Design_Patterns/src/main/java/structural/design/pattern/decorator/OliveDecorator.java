package structural.design.pattern.decorator;

// Olive Decorator
public class OliveDecorator extends PizzaDecorator{

    OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        // Return the wrapped pizza's cost + 30
        return super.getCost() + 30;
    }

    @Override
    public String getDescription() {
        // Return the wrapped pizza's description + ", olives"
        return super.getDescription() + ", Olives";
    }
}
