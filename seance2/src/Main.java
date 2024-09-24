public class Main {
    public static void main(String[] args) {


        Animal lion=new Animal("OSOD","ASAD",10,true);
        Animal[] arrayAnimal={lion};
        Zoo myZoo=new Zoo( "de Marwa  ","tunis   ");

        Animal ghzayla=new Animal("Ghzayla","ghzayla",15,true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        lion.displayAnimal();
        System.out.println(lion.toString());
        myZoo.displayZoo();
    }
}
