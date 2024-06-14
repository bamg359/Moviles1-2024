package conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexionTest {


    public static void main(String[] args) {

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.getConnectDB()){


        }catch (SQLException e){
            System.out.println(e);
        }


    }





}
