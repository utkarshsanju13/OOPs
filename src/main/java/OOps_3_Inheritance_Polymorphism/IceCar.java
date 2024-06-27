package OOps_3_Inheritance_Polymorphism;

public class IceCar extends Vehicle{

    @Override
    public void startEngine(){
        System.out.println("IceCar start Engine");
    }

    @Override
    public void startMedia(){
        System.out.println("Starting the IceCar media");
    }

    public void autoUnlockDoors(){
        System.out.println("Doors are unlocked of IceCar");
    }

    public void checkSuperAndThis(){
        this.startEngine();
        super.startEngine();
    }

}
