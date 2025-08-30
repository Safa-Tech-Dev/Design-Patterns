package solid.principle.openclose;

/**
 *  Cloud Invoice  implementation
 */
public class CloudInvoiceDAO implements InvoiceDAO{

    /**
     * Save invoice to Cloud
     * @param invoiceData
     */
    @Override
    public void saveInvoice(String invoiceData) {
        System.out.println("Saving invoice in Cloud: " + invoiceData);
    }
}
