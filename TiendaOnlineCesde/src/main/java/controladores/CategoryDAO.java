package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import productos.Categoria;

public class CategoryDAO {


    public static void createCategoryDAO(Categoria category){


        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect() ){

            PreparedStatement ps = null;

            try{
                String query = "INSERT INTO category(category_name)VALUES(?)";
                ps = connection.prepareStatement(query);
                ps.setString(1,category.getNombreCategoria());
                ps.executeUpdate();
                System.out.println("Registro de categoria exitoso");

            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }




    public void selectCategoryDAO(){

        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect() ){

            PreparedStatement ps = null;

            ResultSet rs = null;


        }catch (SQLException e){
            System.out.println(e);
        }



    }
}
