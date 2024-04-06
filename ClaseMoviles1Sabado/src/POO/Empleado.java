package POO;

public class Empleado extends Persona {

    String area;
    String cargo;


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
