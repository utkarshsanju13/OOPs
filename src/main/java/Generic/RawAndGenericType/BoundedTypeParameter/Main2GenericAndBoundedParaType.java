package Generic.RawAndGenericType.BoundedTypeParameter;

public class Main2GenericAndBoundedParaType {

    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        int countGreaterThanInt = countGreaterThan(intArray, 2);
        System.out.println("Count of elements greater than 2 in intArray: " + countGreaterThanInt);

        // Example usage with String array
        String[] strArray = {"apple", "banana", "orange", "pear", "grape"};
        int countGreaterThanStr = countGreaterThan(strArray, "banana");
        System.out.println("Count of elements greater than 'banana' in strArray: " + countGreaterThanStr);

    }

    // Generic method to count elements greater than a specified element
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }
}
