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




    public static void selectCategoryDAO(){

        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect() ){

            PreparedStatement ps = null;

            ResultSet rs = null;

            try{

                String query = "SELECT * FROM category";

                ps= connection.prepareStatement(query);

                rs = ps.executeQuery();

                while(rs.next()){

                    System.out.println("Id:" + rs.getInt("id_category"));
                    System.out.println("Nombre Categoria" + rs.getString("category_name"));

                }


            }catch(SQLException e){
                System.out.println(e);
                System.out.println("No se pudo recuperar registros");
            }


        }catch (SQLException e){
            System.out.println(e);
        }



    }
}
