package notasclase;

public class ArrayEstatico {


    public static void main(String[] args) {

        // Un array puede estar inicializado o ser declarado:

        int size = 7;

        String carros[] = new String[size];

        //String[] carros = {"BMW", "Jaguar", "Bently", "Ferrari"};

        System.out.println(carros.length);

        System.out.println(carros[2]);

        carros[2] = "Bently Continental";

        System.out.println(carros[2]);

        carros[4] = "Totoya";

        System.out.println(carros[4]);

        int edades [] = new int[6];

        edades[0]= 23;
        edades[1]= 20;
        edades[2]= 21;
        edades[3]= 23;
        edades[4]= 24;
        edades[5]= 26;

        for(int i = 0; i < edades.length; i++){

            System.out.println(edades[i]);
        }


        // Esto es un foreach
        for(int i: edades){
            System.out.println(i);
        }

    }
}
