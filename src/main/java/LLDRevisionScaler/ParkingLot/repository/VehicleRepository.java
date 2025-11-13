package LLDRevisionScaler.ParkingLot.repository;

import LLDRevisionScaler.ParkingLot.model.Gate;
import LLDRevisionScaler.ParkingLot.model.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {

    Map<Integer, Vehicle> vehicleMap = new HashMap<>();

    public Vehicle findById(int id){
        return vehicleMap.get(id);
    }

    public void save(int id, Vehicle vehicle){
        vehicleMap.put(id, vehicle);
    }
}
