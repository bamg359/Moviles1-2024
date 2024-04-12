package poo;

import java.util.Scanner;

public class Producto {

    Scanner sc = new Scanner(System.in);

    // Atributos

    int id;
    String name;
    double price;
    String category;

    String[][] products = new String[2][3];

    //Metodos

    public void createProduct(){

        int filas = 0;

        while( filas < products.length) {

            String[] product = new String[4];

            System.out.println("id: ");
            id = sc.nextInt();
            product[0] = id + "";
            System.out.println("nombre:");
            sc.nextLine();
            name = sc.nextLine();
            product[1] = name;
            System.out.println("Precio: ");
            price = sc.nextDouble();
            product[2] = price + "";
            sc.nextLine();
            System.out.println("Categoria");
            category = sc.nextLine();
            product[3] = category;
            products[filas] = product;
            filas++;
        }


    }

    public void selectProduct(){

        for(int i= 0; i< products.length; i++){
            for(int j = 0; j< products[i].length; j++){

                System.out.println(products[i][j]);
            }
        }
    }

    public void updateProduct(){

    }

    public void deleteProduct(){

    }

}
