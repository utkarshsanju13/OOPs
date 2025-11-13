package SOLID.Liskov_Substitution_Principle.RectangleSquareExample;

public class Rectangle {

    public int length;
    public int breadth;

    public int getArea(){
        return length * breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
