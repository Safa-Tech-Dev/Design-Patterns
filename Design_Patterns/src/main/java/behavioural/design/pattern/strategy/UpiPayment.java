package behavioural.design.pattern.strategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        IO.println("Paid $ " + amount + " using UPI ");
    }
}
