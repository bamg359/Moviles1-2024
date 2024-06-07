import java.util.LinkedHashMap;
import java.util.Scanner;

public class Producto {


    Scanner sc = new Scanner(System.in);

    private int idProduct;
    private String productName;
    private double price;
    private double cost;
    private double margin;

    // Constructor
    public Producto(){

    }

    //Getters and Setters
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    LinkedHashMap< String,Object > products = new LinkedHashMap<String,Object>();

    public void createProduct(){

        System.out.println("Id");
        idProduct = sc.nextInt();
        products.put("Id",idProduct);
        System.out.println("Nombre");
        productName = sc.nextLine();
        products.put("Nombre producto", productName);
        System.out.println("Costo");
        cost = sc.nextDouble();
        products.put("Costo", cost);
        System.out.println("Margen de ganancia");
        margin = sc.nextDouble();
        System.out.println("Precio");
        price = calculatePrice(cost, margin);

    }

    public double calculatePrice(double cost, double margin){

        double price = cost/(1-margin);

        return price;
    }
}
