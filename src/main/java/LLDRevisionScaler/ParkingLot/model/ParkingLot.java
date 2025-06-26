package LLDRevisionScaler.ParkingLot.model;

import LLDRevisionScaler.ParkingLot.service.Strategy.BillCalculationStrategy.BillCalculationStartegy;
import LLDRevisionScaler.ParkingLot.service.Strategy.SlotAllocation.SlotAllocationStartegy;

import java.util.List;

public class ParkingLot {

    private int id;
    private List<ParkingFloor> floorList;
    private ParkingLotStatus status;
    private int capacity;
    private List<VehicleType> allowedVehicleType;
    private SlotAllocationStartegy slotAllocationStartegy;
    private BillCalculationStartegy billCalculationStartegy;

    public ParkingLot(int id, ParkingLotStatus status, int capacity, List<VehicleType> allowedVehicleType, SlotAllocationStartegy slotAllocationStartegy, BillCalculationStartegy billCalculationStartegy) {
        this.id = id;
        this.status = status;
        this.capacity = capacity;
        this.allowedVehicleType = allowedVehicleType;
        this.slotAllocationStartegy = slotAllocationStartegy;
        this.billCalculationStartegy = billCalculationStartegy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ParkingFloor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<ParkingFloor> floorList) {
        this.floorList = floorList;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<VehicleType> getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(List<VehicleType> allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public SlotAllocationStartegy getSlotAllocationStartegy() {
        return slotAllocationStartegy;
    }

    public void setSlotAllocationStartegy(SlotAllocationStartegy slotAllocationStartegy) {
        this.slotAllocationStartegy = slotAllocationStartegy;
    }

    public BillCalculationStartegy getBillCalculationStartegy() {
        return billCalculationStartegy;
    }

    public void setBillCalculationStartegy(BillCalculationStartegy billCalculationStartegy) {
        this.billCalculationStartegy = billCalculationStartegy;
    }
}
