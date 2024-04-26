package users;

public class User {

    // Atributos encapsulados con el modificador private
    private int id;
    protected String name;
    private String lastName;
    private String phone;
    private String mail;
    private String password;


    // Constructor de la clase

    public User(){

    }

    // Getter and Setter

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
