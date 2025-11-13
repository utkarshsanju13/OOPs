package SOLID.Liskov_Substitution_Principle.BirdExample.VoilatesLSP;

public class Penguin extends Bird{
    @Override
    public void fly() {
        System.out.println("Penguin can't fly");
    }
}
