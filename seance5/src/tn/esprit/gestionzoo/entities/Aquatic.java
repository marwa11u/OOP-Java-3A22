package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    protected String habitat;
    public Aquatic(){}

    @Override
    public String toString() {
        return "family: "+family+" name: " + name + " age: "+age+" isMammal: "+isMammal+" habitat: "+habitat;
    }

    public void swim(){
        System.out.println("this aquatic animal is swimming");
    }
}
