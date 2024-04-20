package POO;

import java.util.Scanner;

public abstract class Persona implements UtilPersona {

    Scanner sc = new Scanner(System.in);

    // Atributos

    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String tipoPersona;

    //Constructores

    public Persona(){

    }

    public Persona(int id, String nombre, String apellido, String telefono, String correo, String tipoPersona) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.tipoPersona = tipoPersona;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }


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
