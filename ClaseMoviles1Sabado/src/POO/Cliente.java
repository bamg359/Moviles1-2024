package POO;

import java.time.LocalDate;

public class Cliente extends Persona{

    Producto producto;

    LocalDate fecha = LocalDate.now();

    private int clave;

    private String prod;

    // Constructor


    public Cliente() {
        super();
    }

    public Cliente(int id, String nombre, String apellido, String telefono, String correo, String tipoPersona, int clave, String prod) {
        super(id, nombre, apellido, telefono, correo, tipoPersona);
        this.clave = clave;
        this.prod = prod;
    }

    //Getters ans Setters


    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    // Metodos Propios

    @Override
    public void crearPersona() {
        super.crearPersona();

        System.out.println("Producto");
        prod = producto.getNombreProducto();
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
