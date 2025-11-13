package Java8Feature.Streams;

import java.util.Objects;

public class Department {

    String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

//    public boolean equals(Object o) {
//        if (this == o) return true;  // Check if both references are pointing to the same object
//        if (o == null || getClass() != o.getClass()) return false;  // Check if the objects are of the same class
//        Department that = (Department) o;  // Cast the object to Department
//        return Objects.equals(name, that.name);  // Compare the name attribute for equality
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
