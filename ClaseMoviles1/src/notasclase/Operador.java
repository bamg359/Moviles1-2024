package notasclase;

import java.util.Scanner;

public class Operador {


    public static void main(String[] args) {

        // Esto es un comentario

        Scanner sc = new Scanner(System.in);

        int resultado = 3+2/7*3;

        System.out.println(resultado);

        System.out.println("Ingrese el numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el numero");
        int num2 = sc.nextInt();

        int operacionSuma = num1 + num2;

        System.out.println("Resultado Suma : " + operacionSuma);

        int operacionResta = num1 - num2;

        System.out.println("Resultado Resta: " + operacionResta);


        System.out.println(num1 + "es mayor que"+ num2);

        boolean esMayor = num1 > num2;

        System.out.println("Es mayor?: " + esMayor);

        boolean telefono = true;

        boolean correo = false;

        boolean contrasena = true;

        boolean ingreso = (telefono ||correo) && contrasena;

        System.out.println("Su ingreso es: " + ingreso);



        // Ejemplo de uso de operadores de asignacion

        int  num3 = 5;


        num3 = num3 + num2;

        num3 += num1;

        System.out.println(num3);











    }
}
