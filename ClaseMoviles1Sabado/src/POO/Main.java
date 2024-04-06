package POO;

public class Main {

    public static void main(String[] args) {

        Empleado empleado = new Empleado();
        Producto producto = new Producto();
        Cliente cliente = new Cliente();

        cliente.producto = producto;

        //empleado.crearPersona();
        //empleado.consultarPersona();
        producto.crearproducto();
        cliente.crearPersona();
        cliente.consultarPersona();

    }
}
