package productManager.storage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import productManager.model.Product;

public class ProductStorage {

    private static final String FILE_PATH = "productManager/storage/product.dat";

    public List<Product> readProducts() {
        List<Product> products = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            while (true) {
                try {
                    Product product = (Product) objectInputStream.readObject();
                    products.add(product);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + FILE_PATH);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public void writeProducts(List<Product> products) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            for (Product product : products) {
                objectOutputStream.writeObject(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addProduct(Product product) {
        List<Product> products = readProducts();
        products.add(product);
        writeProducts(products);
    }
}
