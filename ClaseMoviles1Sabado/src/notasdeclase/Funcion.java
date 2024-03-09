package notasdeclase;

public class Funcion {

    public static void main(String[] args) {

        // Funciones vacias
        // Funciones con retorno
        // Funciones void con parametros
        // Funciones con retorno con parametros

        int paraBD1 = 20;
        int paraBD2 = 10;

        calcularArea();
        calcularArea(paraBD1,paraBD2);
        System.out.println(calcularAreaReturn());
        int verCalculo = calcularAreaReturn();
        System.out.println(verCalculo);
        float areaCirculo = calcularAreaReturn(20);
        System.out.println(areaCirculo);

    }

    public static void calcularArea(){

        int lado1 = 20;
        int lado2= 20;
        int area = lado1*lado2;

        System.out.println(area);
    }

    public static void calcularArea(int lado1, int lado2){

        int area = lado1*lado2;

        System.out.println(area);
    }

    // Cuando la funcion tiene un tipo de dato primitivo , siempre va a retornar un resultado de
    // ese mismo tipo
    public static int calcularAreaReturn(){

        int lado1 = 20;
        int lado2= 20;
        int area = lado1*lado2;

        return area;
    }

    public static float calcularAreaReturn(float radio){

        final float PI = 3.1416f;

        float area = PI*(radio*radio);

        return area;
    }








}
