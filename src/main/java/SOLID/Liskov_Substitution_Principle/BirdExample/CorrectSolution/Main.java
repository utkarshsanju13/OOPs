package SOLID.Liskov_Substitution_Principle.BirdExample.CorrectSolution;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Bird> list = new ArrayList<>(List.of(
                new Sparrow(),
                new Penguin()
        ));

        for(Bird bird : list){
            bird.move();
        }
    }
}
