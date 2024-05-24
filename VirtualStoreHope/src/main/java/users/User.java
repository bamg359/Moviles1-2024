package users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    // Atributos encapsulados con el modificador private
    private int id;
    private String name;
    private String lastName;
    private String phone;
    private String mail;
    private String password;


    // Constructor de la clase


    public User() {

    }


    public User(int id, String name, String lastName, String phone, String mail, String password){

        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
    }

    public User(String mail, String password){

        this.mail = mail;

        this.password = password;
    }



    // Getter and Setter

    public int getId() {
        return id;
    }



    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // metodo propio


    List<ArrayList<Object>> usuarios = new ArrayList<>();
    ArrayList<Object> usuario = new ArrayList<Object>();


    public void crearUsuario() {



        System.out.println("Id:");
        id = sc.nextInt();
        sc.nextLine();
        usuario.add(id);
        System.out.println("Nombre:");
        name = sc.nextLine();
        usuario.add(name);
        System.out.println("Apellido:");
        lastName = sc.nextLine();
        usuario.add(lastName);
        System.out.println("Telefono: ");
        phone = sc.nextLine();
        usuario.add(phone);
        System.out.println("Correo: ");
        mail = sc.nextLine();
        usuario.add(mail);
        System.out.println("Contraseña: ");
        password = sc.nextLine();
        usuario.add(password);

        usuarios.add(usuario);

    }

    public void printUser() {

        for (Object item : usuario) {

            System.out.println(item);

        }

    }


    public void printUsers() {

        for (Object item : usuarios) {

            System.out.println(item);

        }


    }

}
