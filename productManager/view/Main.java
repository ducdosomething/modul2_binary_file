package productManager.view;

import productManager.model.Product;
import productManager.storage.ProductStorage;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductStorage storage = new ProductStorage();

        storage.addProduct(new Product(1, "Book", 300, "Tiki", "Math"));
        storage.addProduct(new Product(2, "Laptop", 200, "Asus", "Vivobook"));
        storage.addProduct(new Product(3, "Shoe", 400, "Nike", "Running"));

        List<Product> allProducts = storage.readProducts();
        for (Product product : allProducts) {
            System.out.println(product);
        }
    }
}
