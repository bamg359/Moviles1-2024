package notasclase;

public class Matriz {


    public static void main(String[] args) {

        String[] user1 =  {"1", "Pepe", "Perez"};
        String[] user2 =  {"2", "Maria", "Perez"};
        String[] user3 =  {"3", "Luisa", "Castro"};

        String[][] users = new String[3][3];

        users[0]= user1;
        users[1]= user2;
        users[2]= user3;

        for(int i = 0; i < users.length; i++){
            for(int j = 0; j < users[i].length; j++){
                System.out.print(users[i][j]+ "  ");
            }
            System.out.println("  ");
        }









    }
}
