package POO;

import java.time.LocalDate;

public class Cliente extends Persona{

    Producto producto;

    LocalDate fecha = LocalDate.now();

    int clave;

    String prod;


    @Override
    public void crearPersona() {
        super.crearPersona();

        System.out.println("Producto");
        prod = producto.nombreProducto;
        System.out.println("Fecha: " + fecha);
        System.out.println("Clave: ");
        clave = sc.nextInt();
    }

    @Override
    public void consultarPersona() {
        super.consultarPersona();

        System.out.println("Producto: " + prod + "\n" +
                "Fecha: " + fecha+ "\n" +
                "clave: ****");
    }
}
