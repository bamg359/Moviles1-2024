package notasclase;

import java.util.Scanner;

public class PracticaArray3 {

    static Scanner sc = new Scanner(System.in);

    static String registroUsuario [] = new String[3];

    public static void main(String[] args) {


        // en esta practica vamos a usar un for para guardar datos en un array



        for(int i = 0; i< registroUsuario.length; i++){
            System.out.println("Ingrese el dato " + (i+1));
            registroUsuario[i] = sc.nextLine();
        }

        iniciarSesion();

    }



    public static void iniciarSesion(){

        System.out.println("Ingrese el correo registrado: ");
        String correo = sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String contrasena = sc.nextLine();

        if(correo.equals(registroUsuario[1]) && contrasena.equals(registroUsuario[2])){

            System.out.println("Bienvenido" + registroUsuario[0]);

            for(String dato: registroUsuario){
                System.out.println(dato);
            }
        }else{
            System.out.println("Valide sus credenciales");
        }
    }
}
