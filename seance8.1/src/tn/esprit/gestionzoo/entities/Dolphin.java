package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.enumer.Food;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(){}


    public void eatMeat(){

    }
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat){
        super(family,name,age,isMammal,habitat);
    }
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed){
        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    public Dolphin(String habitat, float swimmingSpeed){
        super("","",10, false,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public void eatMeat(Food meat) {

    }
    public String toString() {
        return "habitat: "+habitat+" swimmingSpeed: "+swimmingSpeed;
    }

    public void swim(){
        System.out.println("this dolphin is swimming");
    }
}
