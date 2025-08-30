package solid.principle.openclose;

public class FileInvoiceDAO implements InvoiceDAO{
    @Override
    public void saveInvoice(String invoiceData) {
        System.out.println("Saving invoice in File: " + invoiceData);
    }
}
