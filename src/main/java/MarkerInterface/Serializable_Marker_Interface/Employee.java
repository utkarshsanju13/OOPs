package MarkerInterface.Serializable_Marker_Interface;

import MarkerInterface.Custome_Marker_Interface.Secured;

import java.io.*;

public class Employee implements Serializable {
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

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee employee = new Employee("utkarsh",20);
        System.out.println(employee instanceof Serializable);

        FileOutputStream fileOutputStream = new FileOutputStream("serial.sr");
        ObjectOutputStream objs = new ObjectOutputStream(fileOutputStream);
        objs.writeObject(employee);
        objs.close();

        FileInputStream fileInputStream = new FileInputStream("serial.sr");
        ObjectInputStream obji = new ObjectInputStream(fileInputStream);
        Employee emp =  (Employee) obji.readObject();
        System.out.println(emp.toString());
    }
}
