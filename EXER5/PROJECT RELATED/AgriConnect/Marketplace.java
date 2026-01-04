package AgriConnect;

import java.util.ArrayList;

public class Marketplace {
    private ArrayList<Product> products;

    public Marketplace() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProducts() {
        System.out.println("\nProducts in Marketplace:");
        for (Product p : products) {
            System.out.println(p.getProductName() + " - ₱" + p.getPrice());
        }
    }
}
