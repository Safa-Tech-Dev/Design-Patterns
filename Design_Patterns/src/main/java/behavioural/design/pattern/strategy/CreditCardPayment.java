package behavioural.design.pattern.strategy;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        IO.println("Paid $ " + amount + " using Credit card");
    }
}
