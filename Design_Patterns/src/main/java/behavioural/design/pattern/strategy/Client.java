package behavioural.design.pattern.strategy;

public class Client {

    static void main() {

        // Initial setup
        CheckoutService checkoutService = new CheckoutService(new CreditCardPayment());

        checkoutService.checkOut(99.99);

        // Change the behavior at run time
        checkoutService.setPaymentStrategy(new PayPalPayment());
        checkoutService.checkOut(49.99);

        // Change the behavior at run time
        checkoutService.setPaymentStrategy(new UpiPayment());
        checkoutService.checkOut(89.99);
    }
}
