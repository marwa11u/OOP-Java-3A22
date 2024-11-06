package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.enumer.Food;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin(){}
    public Penguin(String habitat, float swimmingDepth){
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public Penguin(String family, String name, int age, boolean isMammal,String habitat, float swimmingDepth){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth(){
        return swimmingDepth;
    }
    public void swim(){
        System.out.println("this penguin can swim");
    }

    public String toString() {
        return "habitat: "+habitat+" swimmingDepth: "+swimmingDepth;
    }
    public void eatMeat(Food meat){

    }
}
