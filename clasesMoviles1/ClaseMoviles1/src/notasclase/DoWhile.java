package notasclase;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int servicios = 8;

        do{

            System.out.println("Servicio" + servicios);
            System.out.println("Desea otro servicio? y/n");
            String yes= sc.nextLine();
            if(yes.equals("y")){
                servicios--;
            }else{
                System.out.println("Tienes servicios pendientes: " + servicios);
            }


        }while(servicios > 0);
    }
}
