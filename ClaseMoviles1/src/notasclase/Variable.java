package notasclase;

public class Variable {

    public static void main(String[] args) {
        byte numByte = 127;

        short numShort = 32767;

        int numInt = 2147483647;
        /////////////////
        //casting de variables
        //
        //concatenacion con operador +
        String nombre = "Maria";
        int edad = 34;
        double pagoRecibido = 1300000;
        boolean esEmpleado = true;

        System.out.println("El empleado" + nombre + "\n"
                + "tiene" + edad + "\n"
                + "Gana" + pagoRecibido + "\n"
                + "se encuentra activo" + esEmpleado);
    }
}
