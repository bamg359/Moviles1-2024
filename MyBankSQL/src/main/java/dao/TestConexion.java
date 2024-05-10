package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {


    public static void main(String[] args) {

        Conexion conexion = new Conexion();


        try(Connection connection = conexion.get_connection()){

            // Esto es la conexion




        }catch(SQLException e){

            System.out.println(e);
        }






    }





}
