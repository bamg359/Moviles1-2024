package notasclase;

public class Variable {

public static void main(String[] args){

    // Variables primitivas


    byte numByte = 127;
    short numShort = 32767;
    int numInt = 2147483548;
    long numLong = 3222272028l;
    float note = 2.94f;
    double salary = 1300000;
    char arroba = 64;
    boolean isMarried= false;

    String salute = "Hello World";

    System.out.println(salute.toUpperCase());

    //Concatenacion

    String name = "Ber";

    double salario = 1300000;

    int age = 25;

    System.out.println("Mi nombre es " + name + " tengo " + age + " años y gano " + salario);
    System.out.println("Nombre: " + name + "\n" + "Edad: " + age + "\n" + "Salario:  " + salario);


    //>casting

    byte ind = 115;

    short ind2= (short) ind;

    System.out.println(ind2);

    ind2 = 134;

    System.out.println(ind2);

    int ind3 = (int) ind2;

    ind3 = 65000;

    System.out.println(ind3);


    // Parseo es una operacion que convierte numeros en texto en numero reales

    String salarioForm = "1300000";

    double salarioNum = Double.parseDouble(salarioForm);

    double descuentoEps = salarioNum * 0.04;

    System.out.println(descuentoEps);


    // Parseo para pasar de numero a String

    String epsString = descuentoEps + "";

    String datosEmpleado[] = new String[4];

    datosEmpleado[0]= epsString;



}

}
