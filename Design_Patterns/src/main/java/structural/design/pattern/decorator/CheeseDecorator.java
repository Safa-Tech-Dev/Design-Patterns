package structural.design.pattern.decorator;

// Cheese Decorator
public class CheeseDecorator extends PizzaDecorator{

    CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        // Return the wrapped pizza's cost + 20
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        // Return the wrapped pizza's description + ", cheese"
        return pizza.getDescription() + ", Cheese";
    }

}
