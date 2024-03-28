package productManager.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int iD;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product() {
    }

    public Product(int iD, String name, double price, String manufacturer, String description) {
        this.iD = iD;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id =" + iD +
                ", name ='" + name + '\'' +
                ", price =" + price +
                ", manufacturer ='" + manufacturer + '\'' +
                ", description ='" + description + '\'' +
                '}';
    }
}
