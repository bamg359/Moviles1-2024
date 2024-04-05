package poo;

import java.util.Scanner;

public class Producto {

    Scanner sc = new Scanner(System.in);

    // Atributos

    int id;
    String name;
    double price;
    String category;

    String[][] products = new String[5][4];

    //Metodos

    public void createProduct(){

        String[] product = new String[5];

        System.out.println("id: ");
        id = sc.nextInt();
        product[0]= id+"";
        System.out.println("nombre:");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Precio: ");
        price= sc.nextDouble();
        sc.nextLine();
        System.out.println("Categoria");
        category = sc.nextLine();

        products[0]= product;
    }

    public void selectProduct(){

    }

    public void updateProduct(){

    }

    public void deleteProduct(){

    }

}
