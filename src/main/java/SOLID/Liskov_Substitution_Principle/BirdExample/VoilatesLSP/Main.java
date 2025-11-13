package SOLID.Liskov_Substitution_Principle.BirdExample.VoilatesLSP;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Bird> listOfBird = new ArrayList<>(List.of(
            new Sparrow(),
            new Penguin()
        ));

        for(Bird bird : listOfBird){
            bird.fly();
        }
    }
}
