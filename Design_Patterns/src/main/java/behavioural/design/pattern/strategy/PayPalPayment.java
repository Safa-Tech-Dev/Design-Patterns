package behavioural.design.pattern.strategy;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {

        IO.println("Paid $ " + amount + " using PayPal");
    }
}
