package notasclase;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // imc = 18 o menos -> bajo peso
        // imc = mayor a 18 y menor a 25 - > peso normal
        // imc mayor igual a 25 y menor que 30 - > sobrepeso
        // imc mayor igual 30 - > obesidad

        System.out.println("Ingrese su Peso:");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su estatura");
        double estatura = sc.nextDouble();

        double imc = Math.round(peso/(estatura*estatura));

        System.out.println(imc);

        if(imc<18){
            System.out.println("Su imc corresponde a bajo peso");
        }else if(imc>= 18 && imc < 25){
            System.out.println("Su imc corresponde a un nivel normal");
        }else if(imc >= 25 && imc < 30){
            System.out.println("Su imc corresponde a sobrepeso");
        }else{
            System.out.println("Su imc corresponde a obesidad");
        }


    }

}
