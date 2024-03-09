package notasdeclase;

import java.util.Scanner;

public class Operador {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int operacion = 200*(35/3)/2+4;

        System.out.println("El resultado de la operacion es: "+ operacion);


        System.out.println("Ingrese el primer número");

        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");

        int num2 = sc.nextInt();

        // Aritméticos (+,-,*,/,%)

        int resultadoSuma = num1 + num2;

        System.out.println("El resultado de la suma es: " + resultadoSuma);

        int resultadoResta = num1 - num2;

        System.out.println("El resultado de la Resta es: " + resultadoResta);

        // Comparación (<, >, <=, >=, ==, !=) retornan un boolean

        boolean esMayor = num1 > num2;

        System.out.println(num1 + " Es mayor que " + num2 + ": " + esMayor);

        boolean esMenor = num1 < num2;

        System.out.println(num1 + " Es Menor que " + num2 + ": " + esMenor);


        // Operadores lógicos (||, &&, not)

        boolean validaEmail = true;

        boolean validaPhone = true;

        boolean validaPassword = false;

        boolean iniciaSesion = (validaEmail || validaPhone) && validaPassword;

        System.out.println("Inicia Sesion: " + iniciaSesion);

        // Operadores de Asignación (=, +=, -=, *=, /=)

        int res = 0;
        res = res + num1;
        System.out.println("El valor de res es: " + res);
        res = res + num1;
        System.out.println("El valor de res es: " + res);
        res = res + num1;
        System.out.println("El valor de res es: " + res);

        int res2 = 0;
        res2 += num1;
        System.out.println(res2);
        res2 += num1;
        System.out.println(res2);
        res2 += num1;
        System.out.println(res2);

        int res3 = 0;

        System.out.println("El valor de res3 es : " +res3++);

        System.out.println("El valor de res3 es : " +res3++);

        System.out.println("El valor de res3 es : " +res3++);





    }







}
