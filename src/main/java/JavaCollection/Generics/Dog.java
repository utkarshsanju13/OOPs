package JavaCollection.Generics;

import java.util.List;

public class Dog extends Animal {

//    String name;

    public Dog(String name){
//        super(this.name);
        this.name = name;
    }

    public static void printName(List<? extends Animal> list){

        for(Animal a : list){
            System.out.println(a.name);
        }
    }
}
