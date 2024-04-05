package notasclase;

import java.util.Scanner;

public class FuncionVoid {

    static Scanner sc = new Scanner(System.in);
    static String [] datosUsuario = new String[5];

    static String numDoc;
    static String nombre;
    static String apellido;
    static String correo;
    static String contrasena;




    //-------------------main------------------------------------------------//

    public static void main(String[] args) {
        /*
        print();
        print("Hola , soy el valor que paso como parametro");
        String nombre = "Ana";

        print("Nombre: " + nombre);*/

        registrarUsuario();
        iniciarSesion();
        imprimirDatos();

    }

    //-------------------------------------------------------------------//

    // Funcion void sin argumentos
    public static void print(){
        String text = "Hola Mundo";
        System.out.println(text);
    }

    // Funcion void con argumentos

    public static void print(String text){
        System.out.println(text);
    }

    public static void registrarUsuario(){

        print("Ingrese el documento de identidad:");
        numDoc = sc.nextLine();
        datosUsuario[0] = numDoc;
        print("Ingrese su Nombre: ");
        nombre = sc.nextLine();
        datosUsuario[1]= nombre;
        print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        datosUsuario[2] = apellido;
        print("Ingrese el correo: ");
        correo = sc.nextLine();
        datosUsuario[3]= correo;
        print("Cree su contraseña: ");
        contrasena = sc.nextLine();
        datosUsuario[4] = contrasena;
    }

    public static void imprimirDatos(){

        for(int i =0 ; i< datosUsuario.length; i++){
            print(datosUsuario[i]);
        }

    }



    public static boolean iniciarSesion(){

        print("Ingrese el correo registrado");
        String correoReg = sc.nextLine();
        print("Ingrese su contraseña registrada");
        String contReg = sc.nextLine();

        if(correoReg.equals(datosUsuario[3]) && contReg.equals(datosUsuario[4])){
            print("Credenciales correctas");
            return true;
        }else{
            print("Credenciales invalidas");
            return false;
        }
    }




}
