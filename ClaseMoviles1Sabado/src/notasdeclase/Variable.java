package notasdeclase;

public class Variable {


    //static boolean isClass = true;

    static int myVarGlobal = 1;

    public static void main(String[] args){


        byte numByte = 127;

        short numByteToShort = (short) numByte;

        System.out.println(numByteToShort);

        numByteToShort = 32000;

        int numShortToInt = (int) numByteToShort;

        numShortToInt = 33000;

        float numIntToFloat = (float) numShortToInt;

        numIntToFloat = 45000.45f;

        long numLong = 3222272028l;

        // Parseo


        String notaString = "4.8";

        String edad = "25";

        float notaFloat = Float.parseFloat(notaString);

        float promNotas = (4.7f + notaFloat)/2;

        System.out.println(promNotas);

        int edadInt = Integer.parseInt(edad);


        String[] datosUsuario = new String[4];


        // Para parsear un numero a string usamos la concatenacion con ""
        String promNotasStr = promNotas + "";

        datosUsuario[0] = promNotasStr;


        // Scope de la variable
        String saludo;

        saludo= "hola";

        saludo = "Eeyy Parce";


        if(myVarGlobal == 0){

            System.out.println(saludo);
        }









        /*String ageString = "25";

        int ageInt = Integer.parseInt(ageString);


        int ageProm = (ageInt + 34)/2;

        System.out.println(ageProm);

        String agePromStr = ageProm + "";


        String promedio[] = new String[3];

        promedio[0]= agePromStr;

        // Scope o ambito de la variable

        System.out.println(isClass);

        boolean noMain = false;

        if(isClass == true){

             noMain = false;

            System.out.println(noMain); // Scope de la variable es local
        }

        System.out.println(noMain);*/




    }
}
