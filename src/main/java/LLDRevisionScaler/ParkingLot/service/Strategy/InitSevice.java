package LLDRevisionScaler.ParkingLot.service.Strategy;

import LLDRevisionScaler.ParkingLot.model.*;
import LLDRevisionScaler.ParkingLot.repository.*;
import LLDRevisionScaler.ParkingLot.service.Strategy.BillCalculationStrategy.SimpleBillCalculationStrategy;
import LLDRevisionScaler.ParkingLot.service.Strategy.SlotAllocation.SimpleSlotAllocationStratgy;
import OOps_3_Inheritance_Polymorphism.Abstraction.A;

import java.util.ArrayList;
import java.util.List;

public class InitSevice {

    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSlotRepository parkingSlotRepository;
    private GateRepository gateRepository;

    public InitSevice(ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSlotRepository parkingSlotRepository, GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSlotRepository = parkingSlotRepository;
        this.gateRepository = gateRepository;
    }

    public void init(){

        ParkingLot parkingLot = new ParkingLot(1, ParkingLotStatus.OPEN,10, List.of(VehicleType.FOUR_WHEELER,VehicleType.TWO_WHEELER),
                new SimpleSlotAllocationStratgy(),new SimpleBillCalculationStrategy());

        parkingLotRepository.save(1,parkingLot);

        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        for(int i = 1; i <=5 ; i++){
            List<ParkingSlot> parkingSlotList = new ArrayList<>();
            for(int j = 1; j <=2; j++){
                ParkingSlot parkingSlot = new ParkingSlot(Integer.valueOf(i+""+j),VehicleType.FOUR_WHEELER,null,ParkingSlotStatus.EMPTY);
                parkingSlotRepository.save(parkingSlot.getId(),parkingSlot);
                parkingSlotList.add(parkingSlot);
            }
            Gate entryGate = new Gate(Integer.valueOf(i+"01"),GateType.ENTRY,"vinod");
            Gate exitGate = new Gate(Integer.valueOf(i+"02"),GateType.EXIT,"vinod");
            gateRepository.save(entryGate.getId(),entryGate);
            gateRepository.save(exitGate.getId(), exitGate);

            ParkingFloor parkingFloor = new ParkingFloor(i,parkingSlotList,entryGate,exitGate);
            parkingFloorList.add(parkingFloor);
            parkingFloorRepository.save(parkingFloor.getId(), parkingFloor);
        }

        ParkingLot savedParkingLot = parkingLotRepository.getParkingLotById(1);
        savedParkingLot.setFloorList(parkingFloorList);
        parkingLotRepository.save(1,savedParkingLot);

    }
}
