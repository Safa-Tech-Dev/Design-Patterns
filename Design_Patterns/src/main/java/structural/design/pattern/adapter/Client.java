package structural.design.pattern.adapter;

//
public class Client {

    static void main() {

        IO.println(" ----- Legacy Gateway via Adapter ----- ");
        LegacyGateway legacyGateway = new LegacyGateway();
        PaymentProcessor paymentProcessor = new LegacyGatewayAdapter(legacyGateway);
        CheckOutService checkOutService = new CheckOutService(paymentProcessor);
        checkOutService.checkout(75.50, "USD");
    }

}
