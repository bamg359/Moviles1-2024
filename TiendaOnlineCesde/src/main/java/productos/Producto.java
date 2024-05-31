package productos;

import java.util.Scanner;

public class Producto {

    Scanner sc = new Scanner(System.in);

    //Atributos

    private int idProducto;
    private String nombreProducto;
    private double costo;
    private double margenGanancia;
    private double precio;
    private int cantidad;
    Categoria categoria;

    // Constructor

    public Producto(){

    }

    public Producto(int idProducto, String nombreProducto,  double costo, double margenGanancia, double precio, int cantidad, Categoria categoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.costo= costo;
        this.margenGanancia = margenGanancia;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Getters and Setters


    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Metodos Propios

    public void crearProducto(){

        System.out.println("Id:");
        idProducto = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre Producto: ");
        nombreProducto = sc.nextLine();
        System.out.println("Costo");
        costo = sc.nextDouble();
        System.out.println("Margen de ganancia ");
        margenGanancia = sc.nextDouble();
        System.out.println("Precio: ");
        precio = calcularPrecio(costo,margenGanancia);
        sc.nextLine();
        System.out.println("Cantidad: ");
        cantidad = sc.nextInt();
        sc.nextLine();
        System.out.println("Categoria:");
        categoria.getNombreCategoria();
    }

    public void seleccionarProducto(){

        System.out.println("Id:" + idProducto);
        System.out.println("Nombre Producto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        String nombreCategoria = categoria.getNombreCategoria();
        System.out.println("Categoria:" + nombreCategoria);

    }

    public double calcularPrecio(double costoProducto, double margenGanancia){

        double precio = costoProducto/(1-margenGanancia);

        return precio;

    }

}
