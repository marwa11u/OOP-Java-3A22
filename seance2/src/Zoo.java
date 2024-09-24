import java.util.Scanner;

public class Zoo {


    Animal[] animals;
    String name;
    String city;
    public static final int NBR_CAGES = 1;

    int animalCount = 0;

    public Zoo(String nom, String cite) {
        // animals=animal;
        name = nom;
        city = cite;
        //nbrCages=nbC;
        this.animals = new Animal[NBR_CAGES];
    }

    public void displayZoo() {

        System.out.println("name: " + name + " city: " + city + "Nb cage: " + NBR_CAGES);
        if (animalCount == 0) {
            System.out.println("no animals in the zoo");
            return;
        }

        System.out.println("animals in the zoo : ");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].displayAnimal();

            }
        }

    }

    public String toString() {
        return ("name: " + name + " city: " + city + " nb animaux: " + animalCount + "/" + NBR_CAGES);
    }



}