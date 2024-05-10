package productos;

import usuarios.Cliente;
import usuarios.Usuario;

public class TestProducto {

    public static void main(String[] args) {
        //Usuario usuario3 = new Usuario();

        Categoria categoria = new Categoria();
        Cliente cliente = new Cliente();
        Producto producto = new Producto();
        Compra compraProducto = new Compra();
        // Vamos a crear la agregacion (o composicion igualando los objectos
        producto.categoria = categoria;
        compraProducto.producto = producto;
        compraProducto.cliente= cliente;


        cliente.crearUsuario();
        cliente.seleccionarUsuario();
        categoria.crearCategoria();
        categoria.seleccionarCategoria();
        producto.crearProducto();
        producto.seleccionarProducto();
        compraProducto.registrarCompra();
        compraProducto.imprimirCompra();


    }
}
