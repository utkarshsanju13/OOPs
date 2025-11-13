package MarkerInterface.Clonable_Marker_interface;

public class Employee {

    public String name;
    public int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee = new Employee("utkarsh", 20);
        Employee cloneObj = (Employee) employee.clone();
        System.out.println(cloneObj);
    }
}
