package notasclase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticaArray {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Como se declara un array

        //1er caso Llenar un formulario:

        System.out.println("indique la cantidad de usuarios a ingresar");
        int row = sc.nextInt();
        sc.nextLine();

        //int col = sc.nextInt();

        String usuarios[][] = new String[row][5];

        String[] encabezados = {"Nombre", "Apellido", "Telefono", "Correo", "Contraseña"};

        String[] datosUsuario = new String[5];

        //datosUsuario[0]= "Pepito";

        usuarios[0]= encabezados;
        usuarios[1]= datosUsuario;

        System.out.println("Escriba 1: Nombre \n" +
                "2: Apellido\n" +
                "...");

        for(int i = 0; i< datosUsuario.length; i++){
            System.out.println("Ingrese el dato #" + (encabezados[i]+1));
            datosUsuario[i] = sc.nextLine();
        }

        for( String dato : datosUsuario){
            System.out.println(dato);
        }


        for(int i = 0; i < usuarios.length; i++){
            for(int j=0; j< usuarios[i].length; j++){
                System.out.print(usuarios[i][j] + "    ");
            }
            System.out.println("\n");
        }





    }
}
