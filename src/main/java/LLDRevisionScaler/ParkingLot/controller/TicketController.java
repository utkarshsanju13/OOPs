package LLDRevisionScaler.ParkingLot.controller;

import LLDRevisionScaler.ParkingLot.model.Ticket;
import LLDRevisionScaler.ParkingLot.model.Vehicle;
import LLDRevisionScaler.ParkingLot.service.Strategy.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket getTicket(int parkingLotId, Vehicle vehicle){
        return  ticketService.getTicket(parkingLotId,vehicle);
    }
}
