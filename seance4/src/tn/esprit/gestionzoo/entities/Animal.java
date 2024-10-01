package tn.esprit.gestionzoo.entities;

import java.util.Scanner;

public class Animal {
    private String family;
    private String name;
    private int age;

    private boolean isMammal;

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

    public Animal(String family, String name, int age, boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public void displayAnimal(){
        System.out.println("family: "+family+" name: " + name + " age: "+age+" isMammal: "+isMammal);

    }

    public String toString() {
        return ("family: "+family+" name: " + name + " age: "+age+" isMammal: "+isMammal);
    }

    /*  public void writeAnimal(){
        System.out.println("to add : ");
        System.out.println("family : ");
        Scanner input_user = new Scanner(System.in);
        family=input_user.next();
        System.out.println("name : ");
        name=input_user.next();
        System.out.println("age : ");
        age=input_user.nextInt();
    }*/

}
