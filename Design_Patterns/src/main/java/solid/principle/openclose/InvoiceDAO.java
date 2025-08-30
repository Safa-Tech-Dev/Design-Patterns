package solid.principle.openclose;

/**
 * (Open for Extension via new implementations)
 * Closed for Modification
 */
public interface InvoiceDAO {

    public void saveInvoice(String invoiceData);
}
