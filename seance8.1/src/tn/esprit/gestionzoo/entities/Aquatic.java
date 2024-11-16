package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.enumer.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public Aquatic(){
    }
     public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }
    public Aquatic(String habitat){
        super();
        this.habitat=habitat;
    }

    public Aquatic(String family, String name, int age, boolean isMammal){
        super(family,name,age,isMammal);
    }

    @Override
    public String toString() {
        return "family: "+family+" name: " + name + " age: "+age+" isMammal: "+isMammal+" habitat: "+habitat;
    }



    public abstract void swim();

    public boolean equals(Object obj){
        if(this==obj) return true;
        if(null==obj) return false;
        if(obj instanceof Aquatic aquatic){
            return aquatic.name.equals(this.name) && aquatic.age==this.age && aquatic.habitat.equals(this.habitat);

        }
return false;
    }

}
