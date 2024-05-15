package OOps1_Into_to_LLD_and_OOPs;

public class Rectangle {

    Point topLeft;
    int height;
    int width;

    int getArea(){
        return this.height * this.width;
    }

    int getPerimeter(){
        return 2 * (height + width);
    }

    Point getBottomRight(){
        Point rightBottom = new Point();
        rightBottom.x = this.topLeft.x + width;
        rightBottom.y = this.topLeft.y - height;

        return rightBottom;
    }

    public static void main(String[] args) {

        Rectangle rc = new Rectangle();
        Point tf = new Point();
        tf.x = 15;
        tf.y = 21;

        rc.topLeft = tf;
        rc.height = 2;
        rc.width = 2;

        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());

//        System.out.print(rc.getBottomRight());
        Point rb = rc.getBottomRight();
        System.out.println(rb.x + " "+ rb.y);



    }
}
