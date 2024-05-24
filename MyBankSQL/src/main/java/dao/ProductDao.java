package dao;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {


    public static void createProductDB(Product product){

        Conexion conexion = new Conexion();
        try(Connection connection = conexion.get_connection()){
            // Esto es la conexion

            PreparedStatement ps = null;

            try{

                String query = "INSERT INTO product(product_name,description, state)VALUES(?,?,?)";

                ps = connection.prepareStatement(query);

                ps.setString(1,product.getNameProduct());
                ps.setString(2,product.getDescription());
                ps.setBoolean(3,product.isState());

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

    public static void listingProductsDB(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;


        try(Connection connection = conexion.get_connection()){

            String query = "SELECT * FROM product";

            ps = conexion.get_connection().prepareStatement(query);

            rs = ps.executeQuery();

            while(rs.next()){

                System.out.println("Id del Producto: " + rs.getInt("id_product") );
                System.out.println("Nombre del producto: " + rs.getString("product_name"));
                System.out.println("Descripción: " + rs.getString("description"));
                System.out.println("Estado" + rs.getString("state"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void deleteproductDB(int idProduct){


        Conexion conexion = new Conexion();////Conxion/////


        try(Connection connection = conexion.get_connection()){////Conxion/////

            PreparedStatement ps = null;

            try{

                String query = "DELETE FROM product WHERE product.id_product = ?";

                ps = conexion.get_connection().prepareStatement(query);

                ps.setInt(1,idProduct);

                ps.executeUpdate();

                System.out.println("El registro ha sido borrado exitosamente");


            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se eliminó el registro");
            }




        }catch(SQLException e){////Conxion/////

            System.out.println(e);////Conxion/////
        }////Conxion/////


    }

    public static void updateProduct(Product product){

        Conexion conexion = new Conexion();////Conxion/////


        try(Connection connection = conexion.get_connection()){////Conxion/////

            PreparedStatement ps = null;
            if(product.getOpc() == 1){

                try{
                    String query = "UPDATE product SET product_name = ? WHERE id_product = ? ";

                    ps = connection.prepareStatement(query);

                    ps.setString(1,product.getNameProduct());

                    ps.setInt(2, product.getIdProduct());

                    ps.executeUpdate();

                    System.out.println("Nombre Actualizado correctamente");


                }catch (SQLException e ){
                    System.out.println(e);
                }

            }else if(product.getOpc() == 2){

                try{
                    String query = "UPDATE product SET description = ? WHERE id_product = ? ";

                    ps = connection.prepareStatement(query);

                    ps.setString(1,product.getDescription());

                    ps.setInt(2, product.getIdProduct());

                    ps.executeUpdate();

                    System.out.println("Descripcion Actualizado correctamente");


                }catch (SQLException e ){
                    System.out.println(e);
                }


            }else if(product.getOpc() == 3){

                try{
                    String query = "UPDATE product SET state = ? WHERE id_product = ? ";

                    ps = connection.prepareStatement(query);

                    ps.setBoolean(1, product.isState());

                    ps.setInt(2,product.getIdProduct());

                    ps.executeUpdate();

                    System.out.println("Estado Actualizado correctamente");

                }catch (SQLException e ){
                    System.out.println(e);
                }
            }else{
                System.out.println("Valide la opcion");
            }
        }catch(SQLException e){////Conxion/////

            System.out.println(e);////Conxion/////
        }////Conxion/////

    }
}
