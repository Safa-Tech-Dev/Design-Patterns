package structural.design.pattern.adapter;

// Target
public interface PaymentProcessor {

    void processPayment(double amount, String currency);
    boolean isPaymentSuccessful();
    String getTransactionId();
}
