package OOps_3_Inheritance_Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Polymorphim {

    public static void main(String[] args) {

        Vehicle c = new Vehicle();
        c.startEngine();

        IceCar ic = new IceCar();
        ic.startEngine();

        //Use of Super and this keyword
        System.out.println("-------------------");
        ic.checkSuperAndThis();

        //Use of upcasting
        /*
        Vehicle has 3 method
        IceCar has 5 method, 3 inherited and 2 new
        Out of 3 inherited , 2 are overridden
        * */
        System.out.println("----------UPCASTING---------");
        Vehicle v = new IceCar();
        v.startEngine(); //execute overridden method from icecar
        v.startAc(); //execute vehicle method because we haven't overridden it
        v.startMedia(); //execute overridden method from icecar
//       v.autoUnlockDoors(); //not doable

        System.out.println("---------ADVATAGES of UPCASTING ( USECASE)----------");
        /*let say there is list of vehicles of different type and we want to start the
                engine of all the vehicle in one go*/

        List<Vehicle> list = new ArrayList<>();
        IceCar mahindra = new IceCar();
        IceCar maruti = new IceCar();
        ElectricCar tesla = new ElectricCar();
        ElectricCar tata = new ElectricCar();
        list.add(mahindra);
        list.add(maruti);
        list.add(tesla);
        list.add(tata);

        startAllCars(list);

        System.out.println("----------Multi level inheritance---------");
        Vehicle vh = new ElectricCar();
//        vh.evCharging(); //we can't call the method because of parent refrence
        vh.startEngine();
        Vehicle vh1 = new AdvancedElectricCar();
        vh1.startEngine();
        vh1.startAc(); //here vehicle class method is called
        ElectricCar ec = new AdvancedElectricCar();
        ec.startEngine();
        ec.startAc(); //here vehicle class method is called



    }

    public static void startAllCars(List<Vehicle> vehicles){

        for(Vehicle v : vehicles){
            v.startEngine();
        }
    }

}
