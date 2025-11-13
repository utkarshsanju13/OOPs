package LLDRevisionScaler.ParkingLot;

import LLDRevisionScaler.ParkingLot.controller.InitController;
import LLDRevisionScaler.ParkingLot.controller.TicketController;
import LLDRevisionScaler.ParkingLot.model.Ticket;
import LLDRevisionScaler.ParkingLot.model.Vehicle;
import LLDRevisionScaler.ParkingLot.model.VehicleType;
import LLDRevisionScaler.ParkingLot.repository.*;
import LLDRevisionScaler.ParkingLot.service.Strategy.InitSevice;
import LLDRevisionScaler.ParkingLot.service.Strategy.TicketService;

public class Client {

    public static void main(String[] args) {

        //repos
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();

        InitSevice initSevice = new InitSevice(parkingLotRepository,parkingFloorRepository,parkingSlotRepository,gateRepository);
        InitController initController = new InitController(initSevice);

        TicketService ticketService = new TicketService(ticketRepository,parkingLotRepository,parkingSlotRepository);
        TicketController ticketController = new TicketController(ticketService);

        initController.init();

        Vehicle newVehicle = new Vehicle(1,"UP708989", VehicleType.FOUR_WHEELER);
        Ticket ticket = ticketController.getTicket(1,newVehicle);





    }
}
