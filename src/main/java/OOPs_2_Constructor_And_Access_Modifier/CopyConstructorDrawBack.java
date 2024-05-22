package OOPs_2_Constructor_And_Access_Modifier;

public class CopyConstructorDrawBack {

    public static void main(String[] args) {
        Dog originalDog = new Dog("Buddy", "Golden Retriever");

        // Using the Dog copy constructor
        Dog copiedDog = new Dog(originalDog);

        System.out.println("Original Dog: " + originalDog.getName() + ", " + originalDog.getBreed());
        System.out.println("Copied Dog: " + copiedDog.getName() + ", " + copiedDog.getBreed());

        // Attempt to copy using Animal reference
        Animal animalRef = originalDog;
        animalRef.getName();
        // This will cause a compilation error because the Animal class copy constructor
        // does not know how to copy the 'breed' field specific to Dog
//         Dog copiedDogFromAnimal = new Dog(animalRef); // Compilation error

//        Copy Constructor Limitation: A copy constructor defined in a parent class (e.g., Animal) cannot initialize fields specific to a subclass (e.g., Dog's breed field).
//        This is because the copy constructor only knows about the fields in its own class.
    }
}

class Animal {
    private String name;

    // Regular constructor
    public Animal(String name) {
        this.name = name;
    }

    // Copy constructor
    public Animal(Animal animal) {
        this.name = animal.name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    // Regular constructor
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // Copy constructor
    public Dog(Dog dog) {
        super(dog);
        this.breed = dog.breed;
    }

    // Getter
    public String getBreed() {
        return breed;
    }
}








