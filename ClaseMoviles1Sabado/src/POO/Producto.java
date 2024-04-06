package POO;

import java.util.Scanner;

public class Producto {

    Scanner sc = new Scanner(System.in);

    int idProducto;

    String nombreProducto;

    public void crearproducto(){

        System.out.println("id: ");
        idProducto = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre del Producto: ");
        nombreProducto = sc.nextLine();
    }



}
