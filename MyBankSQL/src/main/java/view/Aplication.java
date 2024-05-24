package view;

import dao.ProductDao;
import model.Product;
import service.ProductService;

import java.util.Scanner;

public class Aplication {

    Scanner sc = new Scanner(System.in);
    Product product = new Product();
    ProductService productService = new ProductService();
    ProductDao productDao = new ProductDao();
    public void app(){

        System.out.println("Presione 1 para iniciar");
        int init = sc.nextInt();
        sc.nextLine();

        while(init!= 0){

            System.out.println("Seleccione:\n" +
                    "1. Crear producto\n" +
                    "2. Ver productos\n" +
                    "3. Actualizar Producto\n" +
                    "4. Eliminar Producto");

            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc){

                case 1:
                    System.out.println("Crear producto");
                    productService.createProduct(product);
                    break;
                case 2:
                    System.out.println("Listar productos");
                    productService.listingProducts();
                    break;
                case 3:
                    System.out.println("Actualizar productos:");
                    productService.updateProduct(product);
                    break;
                case 4:
                    System.out.println("Eliminar producto");
                    productService.deleteProduct();
                    break;
                default:
                    System.out.println("Ingrese una opcion Valida");
            }
        }
    }
}
