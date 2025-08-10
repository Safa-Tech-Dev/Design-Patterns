package solid.principle.srp;


import java.util.ArrayList;
import java.util.List;

/**
 * Bill calculation, single responsibility = generate invoice
 */


public class InvoiceGenerator {

    List<Product> products = new ArrayList<>();

    // add product to list
    public void addProduct(Product product){
        products.add(product);
    }

    // Calculate the total price of the products
    public double calculateTotal(){

        double total = 0;
        for(Product p : products){
            total += p.getTotalPrice();
        }
        return total;
    }
}
