package notasdeclase;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Este tipo de arreglo es estático
        String [] nombres = {"Pepito" , "Maria" , "Laura", "Juan"};
        //                      0          1          2       3

        System.out.println(nombres[3]);

        nombres[3] = "Juan Pablo";

        System.out.println(nombres[3]);

        int edades [] = new int[4];

        edades[0] = 20;
        edades[1] = 18;
        edades[2] = 22;
        edades[3] = 19;

        System.out.println(edades.length);

        int i = 0;

        while( i < edades.length){
            System.out.println(edades[i]);
            i++;
        }

        float [] notas = new float[3];

        while(i < notas.length){
            System.out.println("Agregue nota: ");
            notas[i] = sc.nextFloat();
            i++;
        }

        for(int j = 0 ; j < notas.length; j++){
            System.out.println("Nota "+ j+1 + notas[j]);
        }



    }
}
