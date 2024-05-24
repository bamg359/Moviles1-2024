package service;

import dao.ProductDao;
import model.Product;

import java.util.Scanner;

public class ProductService {

    Scanner sc = new Scanner(System.in);

    public void createProduct(Product product){

        //System.out.println("Id:");
        //int idProduct = sc.nextInt();
        //sc.nextLine();
        System.out.println("Product Name:");
        String productName= sc.nextLine();
        System.out.println("Description");
        String description = sc.nextLine();
        System.out.println("State:");
        boolean state= sc.nextBoolean();

        //product.setIdProduct(idProduct);
        product.setNameProduct(productName);
        product.setDescription(description);
        product.setState(state);

        ProductDao.createProductDB(product);

    }


    public  void listingProducts(){

            ProductDao.listingProductsDB();

    }


    public void deleteProduct(){

        System.out.println("Ingrese el id del producto a eliminar:");
        int idProduct = sc.nextInt();

        ProductDao.deleteproductDB(idProduct);

    }


    public void updateProduct(Product product){

        System.out.println("Indique el id del producto a actualizar");
        int idProducto = sc.nextInt();
        sc.nextLine();

        System.out.println("Seleccione:\n" +
                "1.Actualizar nombre\n" +
                "2.Actualizar descripción\n" +
                "3.Actualizar Estado");

        int opc = sc.nextInt();

        sc.nextLine();

        switch (opc){
            case 1:

                product.setOpc(opc);
                System.out.println("Indique el nuevo nombre:");
                String productName = sc.nextLine();
                product.setNameProduct(productName);
                product.setIdProduct(idProducto);
                ProductDao.updateProduct(product);
                break;
            case 2:
                product.setOpc(opc);
                System.out.println("Indique la nueva descripción");
                String description = sc.nextLine();
                product.setDescription(description);
                product.setIdProduct(idProducto);
                ProductDao.updateProduct(product);
                break;
            case 3:
                product.setOpc(opc);
                System.out.println("Indique el nuevo estado:");
                boolean state = sc.nextBoolean();
                product.setState(state);
                product.setIdProduct(idProducto);
                ProductDao.updateProduct(product);
                break;
            default:
                System.out.println("Seleccione una opcion adecuada:");
                break;
        }


    }




}
