package Generic.Wildcard.UnboundedWildCard;

import java.util.List;

public class UnboundedWildcard {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = List.of("Apple", "Banana", "Orange");
        List<Animal> animalList = List.of(
                new Animal("hey"),
                new Animal("hello"),
                new Animal("jay")
        );

        //These all will give error as List<Integer> is not a subtype of List<Object>
//        printListofObject(integerList);
//        printListofObject(stringList);
//        printListofObject(animalList);

//        But in this case the <T> is declared as type parameter
        printListOfGeneric(integerList);
        printListOfGeneric(stringList);
        printListOfGeneric(animalList);

//        And in this case the Wildcard is unknown type an
        printListByWildcard(integerList);
        printListByWildcard(stringList);
        printListByWildcard(animalList);

        addElement(integerList);
        addElement(stringList);
//        addElement(animalList);
    }

    public static void printListofObject(List<Object> li){

        for(Object obj: li){
            System.out.print(obj);
        }
        System.out.println();
    }

    public static <T> void printListOfGeneric(List<T> li){

        for(T obj: li){
            System.out.print(obj);
        }
        System.out.println();
    }

    public static void printListByWildcard(List<?> li){

        for(Object obj: li){
            System.out.print(obj.toString());
        }
        System.out.println();
    }

    // Method that adds elements to a list without depending on type
    public static void addElement(List<?> li){

        li.add(null);// Legal to add null to any list
        // list.add("test"); // Compiler error: Cannot invoke add(String) on the wildcard type List<?>
    }
}
