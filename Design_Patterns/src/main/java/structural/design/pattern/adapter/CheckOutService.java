package structural.design.pattern.adapter;

public class CheckOutService {

    private final PaymentProcessor paymentProcessor;

    public CheckOutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount, String currency){

        IO.println("Checkout: Processing order for $ " + amount + " " + currency);
        paymentProcessor.processPayment(amount, currency);
        if (paymentProcessor.isPaymentSuccessful()){
            IO.println("Checkout: Order Successful! TXN: " + paymentProcessor.getTransactionId());
        }else{
            IO.println("Checkout: Order failed.");
        }
    }
}
