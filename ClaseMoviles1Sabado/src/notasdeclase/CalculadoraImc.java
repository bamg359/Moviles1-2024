package notasdeclase;

import java.util.Scanner;

public class CalculadoraImc {

    static Scanner sc = new Scanner(System.in);

    static String nombre;

    static String correo;

    static String contrasena;




    public static void main(String[] args) {

        double resultadoImc = calcularImc(80,1.80);
        leerImc(resultadoImc);
        recomendarTratamiento();


    }


    public static double calcularImc(double peso, double estatura){

        double imc = Math.round( peso/(estatura*estatura));

        return imc;
    }

    public static void leerImc(double imc){

        System.out.println("Su IMC es: " + imc);

        if(imc < 18){
            System.out.println("tiene bajo peso");
        }else if(imc >= 18 && imc <25){
            System.out.println("su peso es normal");
        } else if (imc>= 25 && imc < 30) {
            System.out.println("tiene sobrepeso");
        }else{
            System.out.println("Su imc corresponde con Sobrepeso");
        }
    }


    public static void recomendarTratamiento(){

        System.out.println("Ingrese:\n" +
                "1.Bajo peso\n" +
                "2. Peso Normal\n" +
                "3. Sobrepeso \n" +
                "4. Obesidad");

        int opc = sc.nextInt();

        switch (opc){

            case 1:
                System.out.println("Las recomendaciones para bajo peso son:");
                break;
            case 2:
                System.out.println("Las recomendaciones para que conserve un peso normal son: ");
                break;
            case 3:
                System.out.println("Recomendaciones para manejar el sobrepeso");
                break;
            case 4:
                System.out.println("En caso de obesidad debe: ");
                break;
            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
    }
}
