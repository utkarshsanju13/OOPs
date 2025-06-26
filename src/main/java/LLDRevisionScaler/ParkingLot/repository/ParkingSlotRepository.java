package LLDRevisionScaler.ParkingLot.repository;

import LLDRevisionScaler.ParkingLot.model.ParkingLot;
import LLDRevisionScaler.ParkingLot.model.ParkingSlot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSlotRepository {

    Map<Integer, ParkingSlot> parkingSlotMap = new HashMap<>();

    public ParkingSlot findById(int id){
        ParkingSlot parkingSlot = parkingSlotMap.get(id);
        if(parkingSlot == null){
            throw  new RuntimeException(("No parking slot available bu given id.."));
        }

        return parkingSlot;
    }

    public void save(int id, ParkingSlot parkingSlot){
        parkingSlotMap.put(id, parkingSlot);
    }
}
