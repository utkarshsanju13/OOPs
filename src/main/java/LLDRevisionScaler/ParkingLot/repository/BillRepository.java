package LLDRevisionScaler.ParkingLot.repository;

import LLDRevisionScaler.ParkingLot.model.Bill;
import LLDRevisionScaler.ParkingLot.model.Gate;

import java.util.HashMap;
import java.util.Map;

public class BillRepository {

    Map<Integer, Bill> billMap = new HashMap<>();

    public Bill findById(int id){
        return billMap.get(id);
    }

    public void save(int id, Bill bill){
        billMap.put(id, bill);
    }
}
