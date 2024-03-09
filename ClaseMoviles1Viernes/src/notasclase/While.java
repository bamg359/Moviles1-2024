package notasclase;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciar Servicio: ");
        boolean toma = sc.nextBoolean();
        int tomaAgua = 5;

        while(tomaAgua > 0 && toma == true){

            System.out.println("Desea tomar Aguita: ");
            toma = sc.nextBoolean();

            if(toma==true) {
                System.out.println("Bebiendo Aguita(Ardiente)" + tomaAgua);
                tomaAgua--;
            }else{
                System.out.println("Bebiendo Aguita(Ardiente)" + tomaAgua);
            }
        }
    }



}
