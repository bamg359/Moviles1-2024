package notasdeclase;

import java.util.Scanner;

public class TryCatch {

    static Scanner sc = new Scanner(System.in);

    static String name;
    static String rol;
    static String mail;
    static  String password;

    //static int pos;


    static String [][] usuarios = new String[2][4];


    public static void main(String[] args) {
        registrarDatos();
        registrarDatos();
        //recorrerDatos();

    }


    public static void registrarDatos(){

        String[] datosUsuario = new String[4];

        boolean numerovalido = false;

        while (!numerovalido) {
            try {
                System.out.println("Ingrese posicion: ");
                int pos = sc.nextInt();
                numerovalido = true;
                usuarios[(pos - 1)] = datosUsuario;

            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Solo se permiten numeros");
                System.out.println(e.getMessage());
            }
        }

                sc.nextLine();
                System.out.println("Nombre: ");
                name = sc.nextLine();
                datosUsuario[0] = name;
                System.out.println("Rol: ");
                rol = sc.nextLine();
                datosUsuario[1] = rol;
                System.out.println("Mail: ");
                mail = sc.nextLine();
                datosUsuario[2] = mail;
                System.out.println("Password: ");
                password = sc.nextLine();
                datosUsuario[3] = password;

        }

    public static void recorrerDatos(){

        for(int i = 0; i < usuarios.length ; i++){
            for(int j = 0; j< usuarios[i].length; j++){
                System.out.println(usuarios[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}





