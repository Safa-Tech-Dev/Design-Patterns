package solid.principle.openclose;

/**
 *  Database Invoice  implementation
 */
public class DatabaseInvoiceDAO implements InvoiceDAO{


    /**
     * Save invoice to database
     * @param invoiceData
     */
    @Override
    public void saveInvoice(String invoiceData) {

        System.out.println("Saving invoice  in Database: " + invoiceData);
    }
}
