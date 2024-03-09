package notasclase;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione: \n" +
                "1. Categoria A\n" +
                "2. Categoria B\n" +
                "3. Categoria C\n" +
                "4. Categoria D");

        int categoria = sc.nextInt();

        switch (categoria){

            case 1:
                System.out.println("Beneficios Categoria A");
                break;
            case 2:
                System.out.println("Beneficios Categoria B");
                break;
            case 3:
                System.out.println("Beneficios Categoria C");
                break;
            case 4:
                System.out.println("Precios Categoria D");
                break;
            default:
                System.out.println("Ingrese una categoria valida");

        }
    }
}
