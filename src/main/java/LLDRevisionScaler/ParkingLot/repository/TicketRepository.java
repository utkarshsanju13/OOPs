package LLDRevisionScaler.ParkingLot.repository;

import LLDRevisionScaler.ParkingLot.model.Gate;
import LLDRevisionScaler.ParkingLot.model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<Integer, Ticket> ticketMap = new HashMap<>();

    public Ticket findById(int id){
        return ticketMap.get(id);
    }

    public void save(int id, Ticket ticket){
        ticketMap.put(id, ticket);
    }
}
