package notasclase;

import java.util.Scanner;

public class DoWhile {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boolean tomaOtra; //= sc.nextBoolean();
        int tomaAgua = 5;

       do{

           System.out.println("Sirviendo.." + tomaAgua);
           tomaAgua--;
           System.out.println("Desea otra copa??");
           tomaOtra = sc.nextBoolean();

       }while(tomaAgua > 0 && tomaOtra == true);

    }
}
