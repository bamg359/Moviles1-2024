package POO;

import java.util.Scanner;

public class Producto {

    Scanner sc = new Scanner(System.in);

    private int idProducto;

    private String nombreProducto;

    //Constructores

    public Producto(){
        super();
    }

    public Producto(int idProducto, String nombreProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }

    //Getters and Setters


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

    //Metodos Propios

    public void crearProducto(){

        System.out.println("id: ");
        idProducto = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre del Producto: ");
        nombreProducto = sc.nextLine();
    }

    public void verProducto(){

        System.out.println("Id: " + idProducto + "\n" +
                "Nombre Producto: " + nombreProducto );
    }



}
