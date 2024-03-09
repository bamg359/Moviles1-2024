package notasclase;

import java.util.Scanner;

public class Condicional {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "Pepito";

        String email = "pp@mail.com";

        String phone = "3211100100";

        int password = 123456;

        System.out.println("Ingrese el usuario registrado");

        String user = sc.nextLine();

        System.out.println("Ingrese la contraseña registrada");

        int userPassword = sc.nextInt();

        if( /*condicion*/ (email.equals(user) || phone.equals(user)) && userPassword == password){

            //Proceso que ejecuta en caso de cumplir la condicion

            System.out.println("Bienvenido" + name);
        }else{

        //En caso que no cumpla la condicion hace esto:

            System.out.println("Valide sus credenciales");
        }
    }
}
