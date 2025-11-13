package LLDRevisionScaler.ParkingLot.model;

public class ParkingSlot {

    private int id;
//    private ParkingFloor parkingFloor;
    private VehicleType allowedVehicleType;
    private Vehicle vehicle;
    private ParkingSlotStatus parkingSlotStatus;

    public ParkingSlot(int id, VehicleType allowedVehicleType, Vehicle vehicle, ParkingSlotStatus parkingSlotStatus) {
        this.id = id;
        this.allowedVehicleType = allowedVehicleType;
        this.vehicle = vehicle;
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public ParkingFloor getParkingFloor() {
//        return parkingFloor;
//    }
//
//    public void setParkingFloor(ParkingFloor parkingFloor) {
//        this.parkingFloor = parkingFloor;
//    }

    public VehicleType getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(VehicleType allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }
}
