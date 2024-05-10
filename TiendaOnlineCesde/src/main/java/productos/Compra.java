package productos;

import usuarios.Cliente;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Compra {

    Scanner sc = new Scanner(System.in);

    private int idCompra;
    Cliente cliente;
    Producto producto;
    private int cantidad;

    private double total;

    //Constructores
    public Compra(){

    }

    public Compra(int idCompra, Cliente cliente, Producto producto, int cantidad, double total) {
        this.idCompra = idCompra;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    // Getters and Setters


    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Metodos propios

    LinkedHashSet<Object> compra = new LinkedHashSet<>();

    public void registrarCompra(){

        System.out.println("Ingresar Cod Compra");
        idCompra = sc.nextInt();
        compra.add(idCompra);
        sc.nextLine();
        System.out.println("Ingresa  id cliente:");
        int idCliente = cliente.getCodCliente();
        compra.add(idCliente);
        sc.nextLine();
        System.out.println("Nombre Cliente: ");
        String nombreCliente= cliente.getNombre();
        compra.add(nombreCliente);
        System.out.println("Id producto:");
        int idProducto = producto.getIdProducto();
        compra.add(idProducto);
        sc.nextLine();
        System.out.println("Nombre Producto");
        String nombreProducto = producto.getNombreProducto();
        compra.add(nombreProducto);
        System.out.println("Precio producto");
        double  precio = producto.getPrecio();
        compra.add(precio);
        System.out.println("Cantidad");
        cantidad = sc.nextInt();
        compra.add(cantidad);
        sc.nextLine();
        System.out.println("Total");
        double totalCompra = precio* cantidad;
        compra.add(totalCompra);

    }


    public void imprimirCompra(){


        for (Object item : compra){

            System.out.println(item);
        }
    }
}
