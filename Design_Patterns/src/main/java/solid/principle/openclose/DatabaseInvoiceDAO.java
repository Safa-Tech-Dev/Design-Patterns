package solid.principle.openclose;

public class DatabaseInvoiceDAO implements InvoiceDAO{


    @Override
    public void saveInvoice(String invoiceData) {

        System.out.println("Saving invoice  in Database: " + invoiceData);
    }
}
