package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(){}
    public Dolphin(String habitat, float swimmingSpeed){
        this.habitat = habitat;
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "habitat: "+habitat+" swimmingSpeed: "+swimmingSpeed;
    }

    public void swim(){
        System.out.println("this dolphin is swimming");
    }
}
