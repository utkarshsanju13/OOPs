package LLDRevisionScaler.ParkingLot.model;

import java.util.List;

public class ParkingFloor {

    private int id;
    private List<ParkingSlot> parkingSlotList;
    private Gate entryGate;
    private Gate exitGate;

    public ParkingFloor(int id, List<ParkingSlot> parkingSlotList, Gate entryGate, Gate exitGate) {
        this.id = id;
        this.parkingSlotList = parkingSlotList;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
