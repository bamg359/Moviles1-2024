package notasdeclase;

public class Matrix {

    public static void main(String[] args) {

        String[] nombres = {"Pepito", "Maria", "Juan"};

        String[] correos = {"pp@mail.com", "maria@mail.com", "juan@mail.com"};

        String[][] datosUsuario = {{"Pepito ", "Maria ", "Juan "}, {"pp@mail.com ", "maria@mail.com ", "juan@mail.com "}};


        int filas = 3;
        int colm = 3;

        double[][] notasSubmodulos = new double[filas][colm];

        notasSubmodulos[0][0] = 4.3;
        notasSubmodulos[0][1] = 4.5;
        notasSubmodulos[0][2] = 3.9;
        notasSubmodulos[1][0] = 4.8;
        notasSubmodulos[1][1] = 4.5;
        notasSubmodulos[1][2] = 3.7;
        notasSubmodulos[2][0] = 4.0;
        notasSubmodulos[2][1] = 4.3;
        notasSubmodulos[2][2] = 3.9;


        System.out.println(notasSubmodulos[1][0]);

        notasSubmodulos[1][2] = 4.2;

        System.out.println(notasSubmodulos[1][2]);

        for (int fila = 0; fila < datosUsuario.length; fila++) {
            for (int col = 0; col < datosUsuario[fila].length; col++) {
                System.out.print(datosUsuario[fila][col]);
            }
            System.out.println("\n");
        }

        for (int i = 0; i < notasSubmodulos.length; i++) {
            for (int j = 0; j < notasSubmodulos[i].length; j++) {
                System.out.print(notasSubmodulos[i][j] + " ");
            }
            System.out.println("\n");
        }


        int[] edades1 = {23, 34, 56};

        int[] edades2 = {45, 56, 63};

        int[][] datos = new int[2][3];

        /*
        for(int i = 0; i< datos.length; i++){
            for(int j = 0; j< edades2.length; j++){
                datos[i][j]= edades1[i];
            }
        }*/

        //System.out.println(datos[0]);

        datos[0] = edades1;
        datos[1] = edades2;

        for(int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
}
