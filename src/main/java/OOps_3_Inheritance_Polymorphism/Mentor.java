package OOps_3_Inheritance_Polymorphism;

public class Mentor extends User{

    public int rating;

    public Mentor(int id) {
        super(id);
    }

    public Mentor(){

    }


//    public Mentor(int id) {
//        super(id);
//    }

//    public Mentor(int id, int rating){
//        super(id); // Super must be the first line in constructor
//        this.rating = rating;
//    }

    public void greetAll(){
        super.greet();
    }

    public void greetFromMentor(){
        System.out.println("Hello from mentor");
    }


}
