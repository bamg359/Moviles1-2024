package users;

public class TestUser {


    public static void main(String[] args) {
        User user1 = new User();

        //user1.crearUsuario();
        //user1.crearUsuario();

        //user1.printUsers();

        User userInicio = new User("pp@mail.com", "1234");

        System.out.println(userInicio.getMail());
        System.out.println(userInicio.getPassword());




    }
}
