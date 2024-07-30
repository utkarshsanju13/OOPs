package Java8Feature.Lambda_Streams.Streams;

public class Person {

    String name;
    int Salary;
    Department department;

    public Person(String name, int age, Department department) {
        this.name = name;
        this.Salary = age;
        this.department = department;
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
