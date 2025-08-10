package solid.principle.srp;

/**
 * Single responsibility = Print invoice
 */
public class InvoicePrinter {

    // print the invoice
    public void printInvoice(InvoiceGenerator invoice){

        System.out.println("-------------Invoice--------------");
        for(Product p : invoice.products){
            System.out.println(p);
        }
        System.out.println("Total: ₹" + invoice.calculateTotal());
    }
}
