import AgriConnect.Farmers;
import AgriConnect.Marketplace;
import AgriConnect.Product;

public class Main {
    public static void main(String[] args) {

        // Create a farmer object
        Farmers farmer = new Farmers("Maria Lopez", "Bukidnon");
        System.out.println("Farmer Details:");
        farmer.displayInfo();

        // Create product objects
        Product banana = new Product("Banana", 25.0);
        Product mango = new Product("Mango", 60.0);

        // Create marketplace object
        Marketplace marketplace = new Marketplace();

        // Add products to marketplace
        marketplace.addProduct(banana);
        marketplace.addProduct(mango);

        // Display marketplace products
        System.out.println("\nMarketplace Product List:");
        marketplace.showProducts();
    }
}
