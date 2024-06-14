package daocontroller;

import conexion.Conexion;
import model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryDao {


    public static void createCategoryDao(Category category){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.getConnectDB()){
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO category(category_name)VALUES(?)";

                ps = connect.prepareStatement(query);

                ps.setString(1, category.getCategoryName());

                ps.executeUpdate();



            }catch (SQLException e ){
                System.out.println(e);
            }


        }catch (SQLException e){
            System.out.println(e);
        }
    }


    public static void selectCategoryDao(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.getConnectDB()){


            String query = "SELECT * FROM category";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while(rs.next()){

                System.out.println("ID" + rs.getInt("id_category"));
                System.out.println("Categoria" + rs.getString("category_name"));
            }


        }catch (SQLException e){
            System.out.println(e);
        }



    }

    public static void deleteCategoryDao(int idCategory){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.getConnectDB()){


            PreparedStatement ps = null;

            try{
                String query = "DELETE FROM category WHERE category.id_category = ? ";

                ps = connect.prepareStatement(query);

                ps.setInt(1, idCategory);

                ps.executeUpdate();

                System.out.println("Se ha eliminado la categoria correctamente");


            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

}
