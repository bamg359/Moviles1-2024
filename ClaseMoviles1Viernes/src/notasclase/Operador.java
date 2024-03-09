package notasclase;

import java.util.Scanner;

public class Operador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int resultado = 2*(3+2)/4*3;

        System.out.println(resultado);

        System.out.println("Ingrese el primer número: ");

        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");

        int num2 = sc.nextInt();

        int resultadoSuma = num1 + num2;

        System.out.println("El resultado de la suma es:" + resultadoSuma);

        int resultadoResta = num1 - num2;

        System.out.println("El resultado de la resta es:" + resultadoResta);

        boolean esMayor = num1 > num2;

        System.out.println( num1 +" es mayor que: " + num2 + " = " + esMayor);

        boolean esDiferente = num1 != num2;

        System.out.println( num1 +" es diferente que " + num2 + " = " + esDiferente);

        boolean phone = true;

        boolean email = false;

        boolean password = false;

        boolean inicio= (phone || email) && password;

        System.out.println("El inicio es: " + inicio);

        // Operador de asignación


        int res2 = 0;

        res2 = res2 + num1 + num2;

        System.out.println(res2);

        res2 += num1 + num2;

        System.out.println(res2);

        res2 += num1 + num2;

        System.out.println(res2);

        int res3= 0;
        System.out.println(res3);

        res3++;
        System.out.println(res3);

        res3++;
        System.out.println(res3);

        res3++;
        System.out.println(res3);
    }
}
