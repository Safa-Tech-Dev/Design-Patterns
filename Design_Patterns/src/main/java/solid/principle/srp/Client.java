package solid.principle.srp;

public class Client {

    public static void main(String[] args) {

        InvoiceGenerator invoice = new InvoiceGenerator();
        invoice.addProduct(new Product("Mouse", 499.99, 2));
        invoice.addProduct(new Product("Mouse", 699.80, 1));

        new InvoicePrinter().printInvoice(invoice);
        new InvoiceRepository().save(invoice);
    }
}
