package LLDRevisionScaler.ParkingLot.repository;

import LLDRevisionScaler.ParkingLot.model.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    Map<Integer, ParkingFloor> parkingFloorMap = new HashMap<>();

    public ParkingFloor findById(int id){
        ParkingFloor parkingFloor =  parkingFloorMap.get(id);
        if(parkingFloor == null){
            throw  new RuntimeException("Invalid parking floor id...");
        }

        return parkingFloor;
    }

    public void save(int id, ParkingFloor parkingFloor){
        parkingFloorMap.put(id,parkingFloor);
    }
}
