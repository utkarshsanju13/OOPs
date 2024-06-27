package Assignment;

public class Car implements Comparable<Car> {

    int Price;
    int Speed;

    public int compareTo(Car c){
        return this.Price - c.Price;
    }
}
