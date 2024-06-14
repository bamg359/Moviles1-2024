package servicecontroller;

import model.Category;

public class ServiceTest {


    public static void main(String[] args) {

        Category category = new Category();

        CategoryService cs = new CategoryService();

        cs.createCategory(category);
        cs.selectCategory();
        System.out.println("Ingrese el id de la categoria a eliminar ");
        int id = 2;
        cs.deleteCategory(id);
        cs.selectCategory();



    }
}
