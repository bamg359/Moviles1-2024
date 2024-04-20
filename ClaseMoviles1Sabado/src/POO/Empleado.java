package POO;

public class Empleado extends Persona {

    private String area;
    private String cargo;

    public Empleado(){
        super();
    }

    public Empleado(int id, String nombre, String apellido, String telefono, String correo, String tipoPersona, String area, String cargo) {
        super(id, nombre, apellido, telefono, correo, tipoPersona);
        this.area = area;
        this.cargo = cargo;
    }

    //Getters and Setters


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Metodos propios

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.println("Area: ");
        area = sc.nextLine();
        System.out.println("Cargo: ");
        cargo = sc.nextLine();
    }

    @Override
    public void consultarPersona() {
        super.consultarPersona();
        System.out.println("area: " + area + "\n" +
                "cargo: " + cargo);
    }
}
