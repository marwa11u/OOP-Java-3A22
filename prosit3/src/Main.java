public class Main {
    public static void main(String[] args) {

        Animal lion=new Animal("OSOD","ASAD",10,true);

        Zoo myZoo = new Zoo( "Zoo1  ","kram   ");
        Zoo AnotherZoo = new Zoo( "Zoo2  ","aouina   ");

        Animal ghzayla =new Animal("Ghzayla","ghzayla",15,true);

        int animalCount = 0;

         myZoo.addAnimal(lion);
         myZoo.addAnimal(ghzayla);
         AnotherZoo.addAnimal(lion);
         AnotherZoo.addAnimal(lion);
         System.out.println(myZoo);
         System.out.println(myZoo.toString());
         lion.displayAnimal();
         myZoo.displayZoo();
         AnotherZoo.displayZoo();

         System.out.println("enter name of the animal to search for : ");



         Zoo z=myZoo.CompareZoo(myZoo,AnotherZoo);
         System.out.println("the zoo with the most animals is : ");
         System.out.println(z);


        int pos1 = myZoo.searchAnimal(lion);
        int pos2 = AnotherZoo.searchAnimal(ghzayla);


         myZoo.removeAnimal(lion);
         System.out.println("after removing lion from myZoo");
         myZoo.displayZoo();

    }
}
