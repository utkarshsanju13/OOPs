package OOps_3_Inheritance_Polymorphism;

public class User {
    private int id;
    public String name;
    public String role;


    public User() {

    }
//
//    public User(String name, int id, String role) {
//        this(id,name); //Use of this for a constructor calling
//        this.role = role; //Use of this for a attribute
//    }
//
//    public User(int id, String name) {
//        this(id);// Super must be the first line in constructor
//        this.name = name;
//    }

    public User(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void greet(){
        this.printdetails(); // use of this for a method
        System.out.println("Hi Everyone");
    }

    public void greetFromUser(){
        System.out.println("hello from User class");
    }
    private void printdetails(){
        System.out.println(this.id+" "+this.name + " "+this.role);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
