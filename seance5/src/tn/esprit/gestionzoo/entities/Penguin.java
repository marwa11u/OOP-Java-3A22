package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin(){}
    public Penguin(String habitat, float swimmingDepth){
        this.habitat = habitat;
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "habitat: "+habitat+" swimmingDepth: "+swimmingDepth;
    }
}
