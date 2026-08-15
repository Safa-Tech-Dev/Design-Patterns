package structural.design.pattern.decorator;

// Pizza Decorator , HAS-A PIZZA and IS-A, PIZZA
abstract class PizzaDecorator implements Pizza{

    // Add a protected field to store the wrapped Pizza reference
    protected Pizza pizza;

    PizzaDecorator(Pizza pizza){

    // Store the wrapped pizza
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        // Delegate to the wrapped pizza's getCost()
        return pizza.getCost();
    }

    @Override
    public String getDescription() {
        // Delegate to the wrapped pizza's getDescription()
        return pizza.getDescription();
    }
}
