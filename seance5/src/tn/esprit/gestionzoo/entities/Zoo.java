package tn.esprit.gestionzoo.entities;

import java.util.Scanner;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;


    public static final int NBR_CAGES = 25;

    int animalCount = 0;


    public Zoo(String nom, String cite) {
        // animals=animal;
        name = nom;
        city = cite;
        //nbrCages=nbC;
        this.animals = new Animal[NBR_CAGES];
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("name cannot be empty");
            return;
        } this.name=name;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }

    public Animal[] getAnimals(){
        return animals;
    }
    public void setAnimals(Animal[] animals){
        this.animals=animals;
    }

    public void displayZoo() {

        System.out.println("name: " + name + " city: " + city + "Nb cage: " + NBR_CAGES);
        if(animalCount==0){
            System.out.println("no animals in the zoo");
            return;}

        System.out.println("animals in the zoo : ");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].displayAnimal();

            }
        }

    }

    public String toString() {
        return ("name: " + name + " city: " + city + " nb animaux: "+ animalCount +"/"+ NBR_CAGES);
    }

    public void addAnimal(Animal animal) {
        String Name = animal.getName();
        if (!isZooFull()) {
            for (int i = 0; i < animalCount; i++) {
                if (animals[i] == animal) {
                    System.out.println(animal.getName() + " : already exist ");
                }
            }

            animals[animalCount] = animal;
            animalCount++;
            System.out.println(animal.getName() + " has been added in "+name);

        } else {
            System.out.println(animal.getName() + " cannot be added, the "+ name +" is full");
        }
    }

    static public Zoo CompareZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }

    public void removeAnimal(Animal animal) {
        boolean found=false;
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                found=true;

                System.out.println("animal found and deleted");

                if(i==animalCount-1){
                    animals[i]=null;
                    animalCount--;
                    return;           }
                for(int j= i; j<animalCount;j++){
                    animals[j]=animals[j+1];
                }
                animals[animalCount]=null;
                animalCount--;
            }
        }
        if(!found){
            System.out.println("this animal was not found");
        }
    }

    public int searchAnimal(Animal animal) {
        boolean found = false;
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                found = true;
                System.out.println(animals[i].getName() + " found in position : " + i + " in "+ name);
                return i;
            }
        }
        if (!found) {
            System.out.println("this animal wasn't found in " + name);

        }
        return -1;
    }
    public boolean isZooFull(){
        return animalCount==NBR_CAGES;
    }



}