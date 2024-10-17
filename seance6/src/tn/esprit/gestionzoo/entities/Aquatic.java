package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
    protected String habitat;
    public Aquatic(){
    }
    public Aquatic(String habitat){
        this.habitat=habitat;
    }
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super(family,name,age,isMammal);
        this.habitat=habitat;
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
