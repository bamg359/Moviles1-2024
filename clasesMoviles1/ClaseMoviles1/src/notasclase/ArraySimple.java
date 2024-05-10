package notasclase;

public class ArraySimple {


    public static void main(String[] args) {

        // Este tipo de array es estático, por lo que no podemos agregar nuevos elementos.
        // Lo que si puedo hacer es modificar los existentes.

        int [] edades = {35, 45, 23, 38, 46};

        //     index =    0   1   2   3   4


        System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
        System.out.println(edades[3]);
        System.out.println(edades[4]);

        // POdemos saber el tamaño de un array usando el atributo .length

        System.out.println(edades.length);

        //edades[5] = 23;

        edades[2] = 29;

        System.out.println("Esta es la posición dos "+edades[2]);

        // Para recorrer los arrays tenemos las estructuras for y foreach

        System.out.println("--------------------------------------------");

        for(int i = 0; i < edades.length; i++){
            System.out.println(edades[i]);
        }

        System.out.println("--------------------------------------------");

        //forEach

        for(int edad : edades){
            System.out.println(edad);
        }

        System.out.println("--------------------------------------------");

        //Podemos recorrer el array con un while

        int i = 0;

        while(i< edades.length){


            System.out.println(edades[i]);

            i++;
        }


    }
}
