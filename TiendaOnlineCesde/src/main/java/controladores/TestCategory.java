package controladores;

import productos.Categoria;

public class TestCategory {


    public static void main(String[] args) {


        Categoria category = new Categoria();

        CategoryService  categoryService = new CategoryService();

        categoryService.crearCategoria(category);



    }
}
