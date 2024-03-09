package notasdeclase;

public class CallBack {


    public static void main(String[] args) {

        double salario = 1300000;
        calcularSalarioNeto(calcularPension(salario), calcularEPS(salario), salario );

    }


    public static double calcularEPS(double salary){

        double eps = salary*0.04;
        return eps;
    }

    public static double calcularPension(double salary){

        double pension = salary*0.04;
        return pension;
    }

    public static void calcularSalarioNeto(double calcularEps, double calcularPension, double salario){

        double eps = calcularEps;

        double pension= calcularPension;

        double salarioNeto = salario - pension - eps;

        System.out.println("Descuento por eps: " + eps);
        System.out.println("Descuento por pension: " + pension);

        System.out.println("Salario neto: " + salarioNeto);

    }


}
