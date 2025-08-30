package solid.principle.openclose;

/**
 *  File Invoice  implementation
 */
public class FileInvoiceDAO implements InvoiceDAO{

    /**
     * Save invoice to File
     * @param invoiceData
     */
    @Override
    public void saveInvoice(String invoiceData) {
        System.out.println("Saving invoice in File: " + invoiceData);
    }
}
