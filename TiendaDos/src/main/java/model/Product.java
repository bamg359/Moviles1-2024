package model;

public class Product {

    private int idProduct;
    private String productName;
    private double cost;
    private double price;
    private int quantity;
    private String description;
    private boolean state;

    public Product(){

    }

    public Product(int idProduct, String productName, double cost, double price, int quantity, String description, boolean state) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.cost = cost;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.state = state;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
