package Inheritance;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
//    public void makeSound() {
//        System.out.println("Woof");
//    }

    public void fetch() {
        System.out.println("Fetching the ball");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Upcasting: Dog object is referenced by Animal type

        myAnimal.makeSound();  // This will print: Woof

        // To call a method specific to Dog, we need to downcast
//        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;  // Downcasting
            myDog.fetch();  // This will print: Fetching the ball
        myDog.makeSound();
//        } else {
//            System.out.println("The object is not a Dog");
//        }
    }
}
