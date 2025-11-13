package SOLID.Liskov_Substitution_Principle.BirdExample.CorrectSolution;

public class Penguin extends Bird{

    @Override
    public void move() {
        System.out.println("Penguin is moving...");
    }
}
