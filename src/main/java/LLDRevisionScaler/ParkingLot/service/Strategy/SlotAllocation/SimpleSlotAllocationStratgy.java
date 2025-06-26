package LLDRevisionScaler.ParkingLot.service.Strategy.SlotAllocation;

import LLDRevisionScaler.ParkingLot.exception.NoEmptySlotFoundException;
import LLDRevisionScaler.ParkingLot.model.*;

import java.util.List;

public class SimpleSlotAllocationStratgy implements SlotAllocationStartegy{

    @Override
    public ParkingSlot getParkingSlot(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingFloor> parkingFloors = parkingLot.getFloorList();

        for(ParkingFloor floor : parkingFloors){
            for(ParkingSlot slot : floor.getParkingSlotList()){
                if(slot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY)){
                    return slot;
                }
            }
        }
        throw new NoEmptySlotFoundException("There is no empty slot present");
    }
}
