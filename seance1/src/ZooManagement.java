import java.util.Scanner;

public class ZooManagement {
    int nbCages = 20;
    String zooName  = "my zoo";
    public static void main(String[] args) {

        ZooManagement z=new ZooManagement();
        Scanner user_input=new Scanner(System.in);
        System.out.println("name :");
        String name=user_input.nextLine();
        System.out.println("number :");
        int number=user_input.nextInt();

        z.zooName = name;
        z.nbCages = number;
        System.out.printf(z.zooName + " comporte " + z.nbCages + " cages.");


    }
}