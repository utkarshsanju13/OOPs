package LLDRevisionScaler.ParkingLot.repository;

import LLDRevisionScaler.ParkingLot.model.ParkingLot;
import LLDRevisionScaler.ParkingLot.model.ParkingSlotStatus;
import LLDRevisionScaler.ParkingLot.model.PaymentMode;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    Map<Integer, ParkingLot> parkingLotMap = new HashMap<>();

    public ParkingLot getParkingLotById(int id){
        ParkingLot parkingLot = parkingLotMap.get(id);
        if(parkingLot == null){
            throw new RuntimeException("Invalid parrking lot");
        }
        return parkingLot;
    }

    public void save(int id,ParkingLot parkingLot){
        parkingLotMap.put(id,parkingLot);
    }
}
