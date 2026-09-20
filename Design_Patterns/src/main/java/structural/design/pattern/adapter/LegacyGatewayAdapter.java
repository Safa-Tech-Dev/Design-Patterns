package structural.design.pattern.adapter;

public class LegacyGatewayAdapter implements PaymentProcessor{

    private final LegacyGateway legacyGateway;
    private long currentRef;

    public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }
    @Override
    public void processPayment(double amount, String currency) {

        IO.println("Adapter: Translating paymentProcessor() for " + amount + " " + currency);
        legacyGateway.executeTransaction(amount,currency);
        currentRef = legacyGateway.getReferenceNumber(); // store for later user;


    }
    @Override
    public boolean isPaymentSuccessful() {
        return legacyGateway.checkStatus(currentRef);
    }

    @Override
    public String getTransactionId() {
        return "LEGACY_TXN_" + currentRef;
    }
}
