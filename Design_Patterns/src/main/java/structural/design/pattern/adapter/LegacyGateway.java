package structural.design.pattern.adapter;

//The Incompatible Legacy Gateway
// Adaptee
public class LegacyGateway {

    private long transactionReference;
    private boolean paymentSuccessful;

    public void executeTransaction(double totalAmount, String currency){

        IO.println("LegacyGateway: Executing " + totalAmount + " " + currency);
        transactionReference = System.nanoTime();
        paymentSuccessful = true;
        IO.println("LegacyGateway: Done. Ref: " + transactionReference);
    }
    public boolean checkStatus(long ref){

        IO.println("LegacyGateway: Checking status for ref: " + ref);
        return paymentSuccessful;
    }
    public long getReferenceNumber(){
        return transactionReference;
    }

}
