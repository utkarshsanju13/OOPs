package OOps_3_Inheritance_Polymorphism;

public class ElectricCar extends Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Electric Car start Engine");
    }

    public void evCharging(){
        System.out.println("Charging the Electric Vehicle");
    }
}
