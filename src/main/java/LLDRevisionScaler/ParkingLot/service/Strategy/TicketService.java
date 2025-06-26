package LLDRevisionScaler.ParkingLot.service.Strategy;

import LLDRevisionScaler.ParkingLot.model.*;
import LLDRevisionScaler.ParkingLot.repository.ParkingLotRepository;
import LLDRevisionScaler.ParkingLot.repository.ParkingSlotRepository;
import LLDRevisionScaler.ParkingLot.repository.TicketRepository;

import java.time.LocalDateTime;

public class TicketService {

    private static int ticketId = 0;
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSlotRepository parkingSlotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, ParkingSlotRepository parkingSlotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }

    public Ticket getTicket(int parkingLotId, Vehicle vehicle){

        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(parkingLotId);

        Ticket ticket = new Ticket();

        ParkingSlot parkingSlot = parkingLot.getSlotAllocationStartegy().getParkingSlot(parkingLot,vehicle);
        parkingSlot.setVehicle(vehicle);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
        parkingSlotRepository.save(parkingSlot.getId(),parkingSlot);

        ticket.setId(parkingLotId + parkingSlot.getId());
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setParkingSlot(parkingSlot);
        ticket.setVehicle(vehicle);

        ticketRepository.save(ticket.getId(),ticket);
        return ticket;
    }
}
