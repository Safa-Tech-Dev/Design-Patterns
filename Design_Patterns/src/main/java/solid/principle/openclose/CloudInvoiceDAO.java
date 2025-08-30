package solid.principle.openclose;

public class CloudInvoiceDAO implements InvoiceDAO{
    @Override
    public void saveInvoice(String invoiceData) {
        System.out.println("Saving invoice in Cloud: " + invoiceData);
    }
}
