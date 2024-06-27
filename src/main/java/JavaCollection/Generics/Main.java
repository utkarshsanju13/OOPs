package JavaCollection.Generics;

import java.sql.Array;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        List<Animal> list = List.of(
                new Animal("A1"),
                new Animal("A2"),
                new Dog("d2")
        );

        List<Dog> list2 = List.of(
//                new Animal("A1"),
//                new Animal("A2"),
                new Dog("d1"),
        new Dog("d2"),
        new Dog("d2")
        );

        Animal.printName(list2);

//        ANimal --> dog
//                LIst<Animal>  List<DOg>

//        List<Integer> l = List.copyOf()


    }
}
