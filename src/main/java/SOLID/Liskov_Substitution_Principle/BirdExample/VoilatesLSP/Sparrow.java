package SOLID.Liskov_Substitution_Principle.BirdExample.VoilatesLSP;

public class Sparrow extends Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}
