package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;


public class Main {
    public static void main(String[] args) {

        Animal lion=new Animal("OSOD","ASAD",12,true);
        Animal lion2=new Animal("2OSOD","aASAD",10,true);
        Animal lion3=new Animal("3OSOD","bASAD",5,true);
        Animal lion4=new Animal("4OSOD","cASAD",-40,true);
        Zoo myZoo = new Zoo( "Zoo1  ","kram   ");
        Zoo AnotherZoo = new Zoo( "Zoo2  ","aouina   ");

        Animal ghzayla =new Animal("Ghzayla","ghzayla",15,true);

        int animalCount = 0;


        //seance 8

        try {
            myZoo.addAnimal(lion);
            animalCount++;
            myZoo.addAnimal(lion2);
            animalCount++;
            myZoo.addAnimal(lion3);
            animalCount++;
            myZoo.addAnimal(ghzayla);
            animalCount++;
        } catch (ZooFullException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println(myZoo.getName() + " has " + animalCount + " animals");
        }

        try {
            AnotherZoo.addAnimal(lion4);
        } catch (ZooFullException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }

/*
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
        Aquatic shark = new Dolphin("aquatic","shark",3,false,"hab");
        Aquatic shark2 = new Dolphin("aquatic","shark",3,false,"hab");
        Aquatic crab = new Dolphin("aquatic","crab",2,false,"hab");
        Penguin penguin = new Penguin();
        Dolphin dolphin = new Dolphin();
        Terrestrial terrestrial = new Terrestrial();
        Penguin penguin1 = new Penguin("aquatic","Penguin1",2,false,"hab",188);
        Aquatic penguin2 = new Penguin("aquatic","Penguin2",2,false,"hab",99);
        Dolphin dolphin1 = new Dolphin("aquatic","dolphin",2,false,"hot", 20);


        System.out.println(penguin1);
        System.out.println(dolphin1);

        System.out.println("calling swim method from aquatic class");
        shark.swim();

        System.out.println("calling swim method from penguin class, using the method from aquatic class");
        penguin.swim();

        System.out.println("redefining swim method in penguin class");
        dolphin.swim();


        //SEANCE 6
        System.out.println("\n\n\nSEANCE 6");
        myZoo.addAquaticAnimal(shark);
        myZoo.addAquaticAnimal(crab);
        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.showAllSwim();
        System.out.println("max depth : " +myZoo.maxPenguinSwimmingDepth());

        myZoo.displayNumberOfAquaticsByType();

        if (shark.equals(shark2)) {
            System.out.println("The two sharks are equal.");
        } else {
            System.out.println("The two sharks are not equal.");
        }*/
 }
}
