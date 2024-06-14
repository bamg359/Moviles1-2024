package servicecontroller;

import daocontroller.CategoryDao;
import model.Category;

import java.util.Scanner;

public class CategoryService {

    Scanner sc = new Scanner(System.in);

    public void createCategory(Category category){

        System.out.println("Ingrese el nombre de la categoria");
        String categoryName = sc.nextLine();
        category.setCategoryName(categoryName);

        CategoryDao.createCategoryDao(category);
    }

    public void selectCategory(){

        CategoryDao.selectCategoryDao();

    }

    public void deleteCategory(int idCategory){

        System.out.println("Indique el id de la categoria a borrar");
        int idCategoria = sc.nextInt();

        CategoryDao.deleteCategoryDao(idCategoria);


    }


}
