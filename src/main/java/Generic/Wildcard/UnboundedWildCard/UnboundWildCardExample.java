package Generic.Wildcard.UnboundedWildCard;

import java.util.ArrayList;
import java.util.List;

public class UnboundWildCardExample {

    // Method that adds elements to a list without depending on type
    public static void addElements(List<?> list) {
        list.add(null); // Legal to add null to any list
        // list.add("test"); // Compiler error: Cannot invoke add(String) on the wildcard type List<?>
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        addElements(integerList);
        addElements(stringList);

        System.out.println("Integer list: " + integerList);
        System.out.println("String list: " + stringList);
    }
}

