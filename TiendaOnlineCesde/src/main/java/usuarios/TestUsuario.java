package usuarios;

public class TestUsuario {

    public static void main(String[] args) {

 /* Esta clase ya no puede ser implementada porque es abstracta
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.setNombre("Maria");
        usuario1.setCorreo("maria@mail.com");

        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getCorreo());*/



        Cliente cliente = new Cliente();

        cliente.crearUsuario();

        cliente.seleccionarUsuario();

    }
}
