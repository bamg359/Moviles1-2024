package notasclase;

import java.util.ArrayList;

public class Arreglos {



    public static void main(String[] args) {


        //ArrayList names2={"Ana"};

        ArrayList<String> names = new ArrayList<String>();

        names.add("Laura");
        names.add("Andres");
        names.add("Lucia");
        names.add("Juan");

        String array = String.valueOf(names.stream().iterator());

        System.out.println(array);

        for(String name: names){
            System.out.println(name);
        }

        for(int i=0; i< names.size(); i++){
            System.out.println(names.get(i));
        }







    }




}
