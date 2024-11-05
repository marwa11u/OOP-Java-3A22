package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(){}


    public Dolphin(String family, String name, int age, boolean isMammal,String habitat){
        super(family,name,age,isMammal,habitat);
    }
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed){
        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    public Dolphin(String habitat, float swimmingSpeed){
        super(habitat);
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
