package usuarios;

import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);


    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    // Constructores

    public Usuario(){

    }

    public void Usuario(int id){

        this.id = id;
    }

    public Usuario(int id, String nombre, String apellido, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Encapsulamiento Getters and Setters

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public String getCorreo(){
        return this.correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    // Metodos - comportamientos

    public void crearUsuario(){

        System.out.println("Id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre:");
        nombre = sc.nextLine();
        System.out.println("Apellido:");
        apellido = sc.nextLine();
        System.out.println("Telefono");
        telefono = sc.nextLine();
        System.out.println("Correo");
        correo = sc.nextLine();
    }

    public void actualizarUsuario(){


    }

    public void seleccionarUsuario(){
        System.out.println("Id" + id);
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Telefono" + telefono);
        System.out.println("Correo" + correo);
    }

    public void seleccionarUsuario(String nit, String rut){
        System.out.println("Id" + id);
        System.out.println("Nit:" + nit);
        System.out.println("Rut:" + rut);
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Telefono" + telefono);
        System.out.println("Correo" + correo);
    }

    public void eliminarUsuario(){


    }





}
