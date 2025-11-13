package SOLID.Liskov_Substitution_Principle.RectangleSquareExample;

public class Main {

    public static void main(String[] args) {

        Rectangle square = new Square();
        square.setBreadth(5);
        square.setLength(10);
        //According to the rectangle contract -> the area must be 5 * 10
        //But it return 100 as we have change the contract in square setter method
        //to set the width and height both
        System.out.println(square.getArea());
        makeRectangleWider(square);

    }

    public static void makeRectangleWider(Rectangle rectangle){
       int originlBreath = rectangle.getBreadth();
       rectangle.setBreadth(originlBreath + 10);
        System.out.println("Expected Area: " + (originlBreath + 10) * rectangle.getLength());
        System.out.println("Actual area : " + rectangle.getArea());
    }

}
