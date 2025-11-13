package SOLID.Liskov_Substitution_Principle.BirdExample.CorrectSolution;

public class Sparrow extends Bird implements FlyingBird {
    @Override
    public void move() {
        System.out.println("Sparrow is moving....");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying ......");
    }
}
