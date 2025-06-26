package LLDRevisionScaler.ParkingLot.service.Strategy.SlotAllocation;

import LLDRevisionScaler.ParkingLot.model.ParkingLot;
import LLDRevisionScaler.ParkingLot.model.ParkingSlot;
import LLDRevisionScaler.ParkingLot.model.Vehicle;

public interface SlotAllocationStartegy {

    ParkingSlot getParkingSlot(ParkingLot parkingLot, Vehicle vehicle);
}
