package notasclase;

import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 1. Recomendaciones imc = bajo Peso
        // 2. Recomendaciones imc = Peso normal
        // 3. Recomendaciones imc = Sobrepeso
        // 4. Recomendaciones imc = Obesidad

        System.out.println("Seleccione:\n" +
                "1. Bajo Peso\n" +
                "2. Peso Normal\n" +
                "3. Sobrepeso\n" +
                "4. Obesidad");

        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("Recomendaciones medicas para aumentar el imc");
                break;
            case 2:
                System.out.println("Recomendaciones medicas para mantener el imc normal");
                break;
            case 3:
                System.out.println("Recomendaciones medicas para disminuir el imc con sobrepeso");
                break;
            case 4:
                System.out.println("Recomendaciones medicas para tratar la obesidad");
                break;
            default:
                System.out.println("Ingrese una opcion validad");
                break;
        }

    }
}
