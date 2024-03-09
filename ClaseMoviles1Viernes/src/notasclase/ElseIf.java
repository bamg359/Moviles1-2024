package notasclase;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Si gana <1sm y 2Sm categoria A
        // Si Gana > 2sm y < 3.5sm Categoria b
        // Si gana > 3.5 sm categoria c
        // si es particular es categoria d


        System.out.println("Se encuentra afiliado");
        boolean afiliado = sc.nextBoolean();
        System.out.println("Ingrese su salario: ");
        double salario= sc.nextInt();

        double smmv = 1300000;

        if((salario < smmv && salario < 2*smmv) && afiliado == true){
            System.out.println("Categoria A");
        }else if((salario >2* smmv && salario < 3.5 *smmv) && afiliado == true){
            System.out.println("Categoria B");
        }else if((salario > 3.5*smmv) && afiliado == true){
            System.out.println("Categoria C");
        }else{
            System.out.println("Categoria D");
        }
    }
}
