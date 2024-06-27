package Opps_4_PassByValueAndPassBYReference;

public class Main {

    public static void main(String[] args) {

        Point p = new Point();
        p.x = 10;
        p.y = 20;

        swap(p);
        System.out.println(p.x + " "+ p.y);
    }

    public static void swap(Point point){
        int temp = point.x;
        point.x = point.y;
        point.y = temp;
    }

}
