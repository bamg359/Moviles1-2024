package notasclase;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Identificador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String[] rostros = {"Carlos", "Maria", "Pedro" };

        System.out.println("Acerque su rostro");
        String studentFace= sc.nextLine();

        boolean resultadoComp = Objects.equals(studentFace, rostros);

        //System.out.println(resultadoComp);

        if(studentFace.equals(rostros[0])|| studentFace.equals(rostros[1]) || studentFace.equals(rostros[2])){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Dirijase a la oficina de registro o control");
        }

    }

}
