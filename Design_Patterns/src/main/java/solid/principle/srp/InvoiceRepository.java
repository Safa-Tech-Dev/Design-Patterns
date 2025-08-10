package solid.principle.srp;

/**
 * Single responsibility = save invoice to DB
 */
public class InvoiceRepository {

    public void save(InvoiceGenerator invoice){
        System.out.println("Invoice saved...");
    }
}
