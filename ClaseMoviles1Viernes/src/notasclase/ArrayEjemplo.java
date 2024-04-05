package notasclase;

import java.util.Scanner;

public class ArrayEjemplo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int size = 7;

        String carros[] = new String[7];

        for(int i = 0; i< carros.length; i++){
            System.out.println("Agregue el nombre del carro: " + (i+1));
            carros[i] = sc.nextLine();
        }

        for(String i: carros){
            System.out.println(i);
        }
    }
}
