package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private Aquatic[] aquaticAnimals;
    private final int NBR_AQUATIC_ANIMALS = 10;
    private int aquaticCount = 0;

    public static final int NBR_CAGES = 3;
    private int animalCount = 0;

    public Zoo(String nom, String cite) {
        name = nom;
        city = cite;
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[NBR_AQUATIC_ANIMALS];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
            return;
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void displayZoo() {
        System.out.println("Name: " + name + " | City: " + city + " | Number of cages: " + NBR_CAGES);
        if (animalCount == 0) {
            System.out.println("No animals in the zoo");
            return;
        }

        System.out.println("Animals in the zoo:");
        for (Animal animal : animals) {
            if (animal != null) {
                animal.displayAnimal();
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " | City: " + city + " | Number of animals: " + animalCount + "/" + NBR_CAGES;
    }


    public void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException {
        if (searchAnimal(animal) != -1)
            System.out.println("This animal already exist");
        if (animal.getAge()<0)
            throw new InvalidAgeException("The age cannot be negative");
        if (isZooFull()) {
            throw new ZooFullException("The Zoo is full");
        }
        animals[animalCount] = animal;
        animalCount++;
    }

    public static Zoo CompareZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount > z2.animalCount) ? z1 : z2;
    }

    public void removeAnimal(Animal animal) {
        boolean found = false;
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                found = true;
                System.out.println("Animal " + animal.getName() + " found and deleted.");


                System.arraycopy(animals, i + 1, animals, i, animalCount - i - 1);
                animals[--animalCount] = null;
                break;
            }
        }
        if (!found) {
            System.out.println("This animal was not found");
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return animalCount == NBR_CAGES;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        aquaticAnimals[aquaticCount] = aquatic;
        aquaticCount++;
    }

    public void showAllSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                maxDepth = Math.max(maxDepth, penguin.getSwimmingDepth());
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int penguinCount = 0;
        int dolphinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            } else if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            }
        }
        System.out.println("Penguins: " + penguinCount + " | Dolphins: " + dolphinCount);
    }
}
