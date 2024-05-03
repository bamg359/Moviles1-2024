package productos;

import usuarios.Usuario;

public class TestProducto {

    public static void main(String[] args) {
        Usuario usuario3 = new Usuario();

        Categoria categoria = new Categoria();
        Producto producto = new Producto();
        // Vamos a crear la agregacion (o composicion igualando los objectos
        producto.categoria = categoria;

        categoria.crearCategoria();
        categoria.seleccionarCategoria();
        producto.crearProducto();
        producto.seleccionarProducto();


    }
}
