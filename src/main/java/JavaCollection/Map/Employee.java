package JavaCollection.Map;

import java.util.Objects;

public class Employee {

    public int age;
    public String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Employee e = (Employee) obj;
        return this.age == (e.age) && this.name.equals(e.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
