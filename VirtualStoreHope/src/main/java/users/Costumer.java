package users;

public class Costumer extends User {

    private int codCliente;
    private String tipoCliente;


    public Costumer() {
        super();
    }

    public Costumer(int id, String name, String lastName, String phone, String mail, String password, int codCliente, String tipoCliente) {
        super(id, name, lastName, phone, mail, password);
        this.codCliente = codCliente;
        this.tipoCliente = tipoCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public void crearUsuario() {
        super.crearUsuario();
        System.out.println("Cod Cliente");
        codCliente = sc.nextInt();
        System.out.println("Tipo Cliente");
        System.out.println("Seleccione 1. Persona natural 2. Persona juridica");
        int opc = sc.nextInt();
        tipoCliente = seleccionarTipoCliente(opc);
    }

    public String seleccionarTipoCliente(int opc) {

        if (opc == 1) {
            String personaNatural = String.valueOf(TipoCliente.PERSONAL_NATURAL);
            return personaNatural;
        } else if (opc == 2) {
            String personaJuridica = String.valueOf(TipoCliente.PERSONA_JURICA);
            return personaJuridica;
        } else {
            String mensaje ="Seleccione un valor valido";
            return mensaje;
        }
    }
}
