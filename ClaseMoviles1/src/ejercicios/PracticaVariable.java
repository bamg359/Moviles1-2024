package ejercicios;

public class PracticaVariable {
    public static void main(String[] args) {
        String nombre = "Javier";
        String apellido = "Boyaca";
        int edad =30;
        String telefono = "3204214872";
        String direccion = "cara54 # 41 63 sur";
        String cargo = "agente bilingua";
        boolean activo = true;
        String pago = "2000000";
        String pagoCarnet = "100000";


        // Parseo
        int pagoParse= Integer.parseInt(pago);
        int CarnetParse = Integer.parseInt(pagoCarnet);

        int TotalApagar = (pagoParse + CarnetParse);

                System.out.println("Nombre:" + nombre + "\n"
                + "Apellido:" + "\n"
                + "Edad" + edad + "\n"
                +"Telefono:" + telefono + "\n"
                + "Direccion" + direccion + "\n"
                +"Cargo:" + cargo + "\n"
                + "Activo" + activo + "\n"
                + "Total a pagar:" + TotalApagar);
    }
}
