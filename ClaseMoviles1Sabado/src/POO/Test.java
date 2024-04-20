package POO;

public class Test {


    public static void main(String[] args) {


        Producto producto = new Producto();
        Cliente cliente = new Cliente();




        cliente.producto = producto;
        producto.crearProducto();
        producto.verProducto();
        cliente.crearPersona();
        cliente.consultarPersona();

    }
}
