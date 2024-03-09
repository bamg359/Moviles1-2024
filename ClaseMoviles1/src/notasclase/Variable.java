package notasclase;

public class Variable {

    public static void main(String[] args){



        byte numByte;

        numByte = 127;

        short numShort = 32767;

        int numInt = 2147483647;

        // Casting de variable

        short numByteShort = (short) numByte ;

        System.out.println(numByteShort);

        numByteShort = 128;

        System.out.println(numByteShort);

        int numShortInt = (int) numByteShort;

        numShortInt = 1160000;

        System.out.println(numShortInt);

        byte numIntByte = (byte) numShortInt;

        numIntByte = 32;

        /// Parseo:

        String numString = "32";

        System.out.println(numString);

        //int mult = numString*100;

        int numStringToInt =  Integer.parseInt(numString);

        int mult = numStringToInt*100;

        System.out.println(numStringToInt);


        int numInt2 = 25;
        //Esto es un comentario
        //
        String numIntToString = numInt2 + "";

        // Variables por tipo de datos

        String name = "Pepito";

        byte num1 = 127;

        float nota = 4.5f;

        double salario = 1300000;

        long numeroLargo = 3222272028l;

        boolean trabaja = true;

        boolean casado = false;

        char arroba = 64;

        System.out.println(arroba);

        // Constante

        final float PI = 3.1416f;

        //concatenacion con operador +

        String nombre = "Maria";
        int edad = 34;
        double pagoRecibido = 1300000;
        boolean esEmpleado = true;

        System.out.println("El empleado " + nombre + "\n"
                + "tiene " + edad + "\n"
                + "Gana " + pagoRecibido + "\n"
                + "se encuentra activo: " + esEmpleado);







    }
}
