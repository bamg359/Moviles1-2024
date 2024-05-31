package users;

import java.util.Scanner;

public class Product {

    Scanner sc = new Scanner(System.in);

    private int idProduct;
    private String productName;
    private double price;
    private int quantity;
    private String state;
    private Category category;


    public Product(){

    }

    public Product(int idProduct, String productName, double price, int quantity, String state, Category category) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.state = state;
        this.category = category;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void createProduct(double cost, double rate){

        System.out.println("id");
        idProduct = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre del producto:");
        productName = sc.nextLine();
        System.out.println("Precio");
        price = calculatePrice(cost, rate);



    }

    public double calculatePrice(double cost, double rate){

        price = cost/(1- rate);

        return price;

    }


}
