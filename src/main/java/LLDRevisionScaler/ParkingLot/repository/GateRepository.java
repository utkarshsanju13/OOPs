package LLDRevisionScaler.ParkingLot.repository;

import LLDRevisionScaler.ParkingLot.model.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {

    Map<Integer, Gate> gateMap  = new HashMap<>();

    public Gate findById(int id){
        return gateMap.get(id);
    }

    public void save(int id, Gate gate){
        gateMap.put(id, gate);
    }

}
