import java.util.Scanner;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;


    public Animal(String famille, String nom, int ag, boolean is){
        family=famille;
        name=nom;
        age=ag;
        isMammal=is;
    }
    public void displayAnimal(){
        System.out.println("family: "+family+" name: " + name + " age: "+age+" isMammal: "+isMammal);

    }

    public String toString() {
        return ("family: "+family+" name: " + name + " age: "+age+" isMammal: "+isMammal);
    }



}