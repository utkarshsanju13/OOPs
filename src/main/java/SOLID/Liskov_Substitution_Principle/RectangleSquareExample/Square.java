package SOLID.Liskov_Substitution_Principle.RectangleSquareExample;

public class Square extends Rectangle{

    @Override
    public void setBreadth(int side) {
        this.breadth = side;
        this.length = side;
    }

    @Override
    public void setLength(int side) {
        this.length = side;
        this.breadth = side;
    }


}
