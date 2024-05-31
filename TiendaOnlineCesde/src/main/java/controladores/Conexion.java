package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {


    public Connection getConnect(){

        Connection connection = null;

        try{

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendacesde", "root", "");

            if(connection!= null){
                System.out.println("Conexión Exitosa!!");
            }


        }catch (SQLException e){

            System.out.println(e);
        }

        return connection;



    }




}
