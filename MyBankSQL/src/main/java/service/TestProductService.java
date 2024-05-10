package service;

import model.Product;

public class TestProductService {

    public static void main(String[] args) {

        ProductService productService = new ProductService();
        Product product = new Product();
        productService.createProduct(product);

    }
}
