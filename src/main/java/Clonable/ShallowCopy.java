package Clonable;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;

class Address implements Cloneable{
    int streatNo;
    String restAdress;

    public Address(int streatNo, String restAdress) {
        this.streatNo = streatNo;
        this.restAdress = restAdress;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements  Cloneable{
    int id;
    String name;
    Address address;

    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();

        Person p = (Person) super.clone();
         p.address = (Address) address.clone();

         return p;
    }

}

public class ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new
                Person();
        p1.id= 1;
        p1.name = "abc";
        p1.address = new Address(1,"bhawapur");
        Person p2 = (Person) p1.clone();

        System.out.println(p1.address);
        System.out.println(p2.address);
    }
}
