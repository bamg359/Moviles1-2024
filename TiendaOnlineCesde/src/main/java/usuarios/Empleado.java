package usuarios;

public class Empleado extends Usuario {

    private String cargo;

    private double salario;


    public Empleado() {
        super();
    }

    public Empleado(int id, String nombre, String apellido, String telefono, String correo, String cargo, double salario) {
        super(id, nombre, apellido, telefono, correo);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void crearUsuario() {
        super.crearUsuario();
        System.out.println("Cargo:");
        cargo = sc.nextLine();
        System.out.println("Salario");
        salario = sc.nextDouble();
    }
}
