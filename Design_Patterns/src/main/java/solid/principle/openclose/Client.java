package solid.principle.openclose;

public class Client {

    public static void main(String[] args) {

        InvoiceDAO databaseInvoice = new DatabaseInvoiceDAO();
        databaseInvoice.saveInvoice("Invoice#201");

        InvoiceDAO fileInvoice = new FileInvoiceDAO();
        fileInvoice.saveInvoice("Invoice#202");

        InvoiceDAO cloudInvoice = new CloudInvoiceDAO();
        cloudInvoice.saveInvoice("Invoice#203");
    }
}
