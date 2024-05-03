package usuarios;

public class Cliente extends Usuario {

    private String tipoCliente;

    private int codCliente;

    //Construtor

    public Cliente(){
        super();
    }

    public Cliente(int id, String nombre, String apellido, String telefono, String correo, String tipoCliente, int codCliente) {
        super(id, nombre, apellido, telefono, correo);
        this.tipoCliente = tipoCliente;
        this.codCliente = codCliente;
    }


    // Getters and Setters


    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    //Metodos propios


    @Override
    public void crearUsuario() {

        super.crearUsuario();
        System.out.println("Tipo Cliente:");
        tipoCliente = sc.nextLine();
        System.out.println("Codigo Cliente:");
        codCliente = sc.nextInt();

    }

    @Override
    public void actualizarUsuario() {
        super.actualizarUsuario();
    }

    @Override
    public void seleccionarUsuario() {

        super.seleccionarUsuario();

        System.out.println("Tipo Cliente:" + tipoCliente);

        System.out.println("Codigo Cliente:" + codCliente);

    }

    @Override
    public void seleccionarUsuario(String nit, String rut) {
        super.seleccionarUsuario(nit, rut);

        System.out.println("Tipo Cliente:" + tipoCliente);

        System.out.println("Codigo Cliente:" + codCliente);
    }

    @Override
    public void eliminarUsuario() {
        super.eliminarUsuario();
    }
}
