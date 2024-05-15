package OOps1_Into_to_LLD_and_OOPs;

public class Circle {
    Point center;
    int radius;

    double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    double getParameter(){
        return 2 * Math.PI * this.radius;
    }

    boolean isOverlapping(Circle c){

        double distance = Math.sqrt(
                Math.pow(this.center.x - c.center.x,2)+
                        Math.pow(this.center.y - c.center.y,2));

        return distance <= (this.radius + c.radius);
    }

    public static void main(String[] args) {

        Circle c = new Circle();
        Point c1 = new Point();
        c1.x = 2;
        c1.y = 2;



    }
}
