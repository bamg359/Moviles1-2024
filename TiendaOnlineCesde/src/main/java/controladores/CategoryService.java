package controladores;

import productos.Categoria;

import java.util.Scanner;

public class CategoryService {

    Scanner sc = new Scanner(System.in);
    public void crearCategoria(Categoria categoria){

        System.out.println("Id Categoria");
        int idCategoria = sc.nextInt();
        sc.nextLine();
        categoria.setIdCategoria(idCategoria);
        System.out.println("Nombre Categoria");
        String nombreCategoria = sc.nextLine();
        categoria.setNombreCategoria(nombreCategoria);

        CategoryDAO.createCategoryDAO(categoria);

    }


    public void selectCategory(){



    }



}
