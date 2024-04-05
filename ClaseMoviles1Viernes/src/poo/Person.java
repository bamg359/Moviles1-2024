package poo;

import java.util.Scanner;

public class Person {

    Scanner sc = new Scanner(System.in);

    // Atributos

    int id;
    String name;
    String lastName;
    String personType;
    String mail;
    String password;

    String[] user = new String[6];

    static int file;

    String[][] users = new String[2][6];

    // Métodos

    public void createPerson(){

        System.out.println("#usuarios a registrar: ");
        file = sc.nextInt();
        System.out.println(file);

        int i = 0;

        while(i < users.length) {
            System.out.println(file);
            System.out.println("Agregue el usuario" + i);
            System.out.println("Id:");
            id = sc.nextInt();
            sc.nextLine();
            user[0] = id + "";
            System.out.println("Name:");
            name = sc.nextLine();
            user[1] = name;
            System.out.println("lastName: ");
            lastName = sc.nextLine();
            user[2] = lastName;
            System.out.println("personType");
            personType = sc.nextLine();
            user[3] = personType;
            System.out.println("Email:");
            mail = sc.nextLine();
            user[4] = mail;
            System.out.println("Password: ");
            password = sc.nextLine();
            user[5] = password;

            users[i]= user;
            i++;



        }



    }

    public void readPerson(){

        for( int i = 0 ; i< user.length; i++){

            System.out.println(user[i]);
        }

    }

    public void readPersons(){

        for( int i = 0 ; i< users.length; i++){
            for(int j = 0; j < users[i].length; j++){
                System.out.print(users[i][j]+ "  ");
            }

            System.out.println();
        }
    }

    public void updatePerson(){

    }

    public void deletePerson(){

    }


}
