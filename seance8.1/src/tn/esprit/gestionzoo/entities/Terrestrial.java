package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.enumer.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;
    public Terrestrial(){}


    public void eatMeat(Food meat){
        System.out.println("The terrestrial "+getName()+"eat Meat");
    }
    public void eatPlant(Food plant){
        System.out.println("The terrestrial "+getName()+"eat Plant");
    }
    public void eatPlantAndMeet(Food food){
        System.out.println("The terrestrial "+getName()+"eat Meat and Plant");
    }


}
