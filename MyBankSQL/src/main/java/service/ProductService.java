package service;

import dao.ProductDao;
import model.Product;

import java.util.Scanner;

public class ProductService {

    Scanner sc = new Scanner(System.in);

    public void createProduct(Product product){

        System.out.println("Id:");
        int idProduct = sc.nextInt();
        sc.nextLine();
        System.out.println("Product Name:");
        String productName= sc.nextLine();
        System.out.println("Description");
        String description = sc.nextLine();
        System.out.println("State:");
        boolean state= sc.nextBoolean();

        product.setIdProduct(idProduct);
        product.setNameProduct(productName);
        product.setDescription(description);
        product.setState(state);

        ProductDao.createProductDB(product);





    }




}
