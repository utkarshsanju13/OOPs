package JavaCollection.Generics;

import java.util.List;

public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }
    public Animal(){

    }

    public static void printName(List<? extends Animal> list){

        for(Animal a : list){
            System.out.println(a.name);
        }
    }
}
