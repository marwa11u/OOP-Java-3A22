import java.util.Scanner;

public class ZooManagement {
    int nbCages = 20;
    String zooName  = "my zoo";
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ZooManagement z=new ZooManagement();
        Scanner user_input=new Scanner(System.in);
        System.out.println("name :");
        String name=user_input.nextLine();
        System.out.println("number :");
        int number=user_input.nextInt();


        System.out.println("last name :");
        String lastname = user_input.next();

        System.out.println(name+ " " + number + " "+ lastname);
        System.out.printf(z.zooName + " comporte " + z.nbCages + " cages.");


    }
}