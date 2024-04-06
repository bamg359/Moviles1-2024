package POO;

import java.util.Scanner;

public class Persona {

    Scanner sc = new Scanner(System.in);

    // Atributos

    int id;
    String nombre;
    String apellido;
    String telefono;
    String correo;
    String tipoPersona;


    // Metodos

    public void crearPersona(){

        System.out.println("id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Telefono: ");
        telefono = sc.nextLine();
        System.out.println("Correo: ");
        correo = sc.nextLine();
        System.out.println("Tipo Persona");
        tipoPersona = sc.nextLine();
    }

    public void consultarPersona(){

        System.out.println("id " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "apellido: " + apellido + "\n" +
                "telefono: " + telefono + "\n" +
                "correo: " + correo + "\n" +
                "tipo Persona: " + tipoPersona + "\n");
    }


}
