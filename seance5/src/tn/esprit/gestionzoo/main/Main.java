package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;


public class Main {
    public static void main(String[] args) {

        Animal lion=new Animal("OSOD","ASAD",10,true);

        Zoo myZoo = new Zoo( "Zoo1  ","kram   ");
        Zoo AnotherZoo = new Zoo( "Zoo2  ","aouina   ");

        Animal ghzayla =new Animal("Ghzayla","ghzayla",15,true);

        int animalCount = 0;

        myZoo.addAnimal(lion);
        myZoo.addAnimal(ghzayla);
        AnotherZoo.addAnimal(lion);
        AnotherZoo.addAnimal(lion);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        lion.displayAnimal();
        myZoo.displayZoo();
        AnotherZoo.displayZoo();

        System.out.println("enter name of the animal to search for : ");



        Zoo z = Zoo.CompareZoo(myZoo,AnotherZoo);
        System.out.println("the zoo with the most animals is : ");
        System.out.println(z);


        int pos1 = myZoo.searchAnimal(lion);
        int pos2 = AnotherZoo.searchAnimal(ghzayla);
        myZoo.removeAnimal(lion);
        System.out.println("after removing lion from myZoo");
        myZoo.displayZoo();

        //SEANCE 5
        System.out.println("\n\n\nSEANCE 5");
        Aquatic aquatic = new Aquatic();
        Penguin penguin = new Penguin();
        Dolphin dolphin = new Dolphin();
        Terrestrial terrestrial = new Terrestrial();
        Penguin penguin1 = new Penguin("cold", 10);
        Dolphin dolphin1 = new Dolphin("hot", 20);
        System.out.println(penguin1);
        System.out.println(dolphin1);

        System.out.println("calling swim method from aquatic class");
        aquatic.swim();

        System.out.println("calling swim method from penguin class, using the method from aquatic class");
        penguin.swim();

        System.out.println("redefining swim method in penguin class");
        dolphin.swim();

    }
}
