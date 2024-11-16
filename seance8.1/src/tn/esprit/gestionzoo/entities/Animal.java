package tn.esprit.gestionzoo.entities;

public class Animal{
    protected String family;
    protected String name;
    protected int age;

    protected boolean isMammal;

    public Animal(){}

    public Animal(String family, String name, int age, boolean isMammal) {

        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public String getFamily(){
        return family;
    }
    public void setFamily(String family){
        this.family=family;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("age must be positive");
            return;}
        this.age=age;
    }


    public void displayAnimal(){
        System.out.println("family: "+family+" name: " + name + " age: "+age+" isMammal: "+isMammal);

    }



}
