package dao;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDao {


    public static void createProductDB(Product product){

        Conexion conexion = new Conexion();
        try(Connection connection = conexion.get_connection()){
            // Esto es la conexion

            PreparedStatement ps = null;

            try{

                String query = "INSERT INTO product(product_name)VALUES(?)";

                ps = connection.prepareStatement(query);

                ps.setString(1,product.getNameProduct());

                ps.executeUpdate();

                System.out.println("Registro de producto exitoso");


            }catch (SQLException e){
                System.out.println(e);
            }









            //Esto es la conexion
        }catch(SQLException e){
            System.out.println(e);
        }




    }









}
