package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {


    public static void main(String[] args) {

        Conexion conexion = new Conexion();////Conxion/////


        try(Connection connection = conexion.get_connection()){////Conxion/////

            // Esto es la conexion




        }catch(SQLException e){////Conxion/////

            System.out.println(e);////Conxion/////
        }////Conxion/////






    }





}
