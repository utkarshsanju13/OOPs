package LLDRevisionScaler.ParkingLot.service.Strategy.BillCalculationStrategy;

import LLDRevisionScaler.ParkingLot.model.Bill;
import LLDRevisionScaler.ParkingLot.model.Ticket;

public interface BillCalculationStartegy {

    Bill calculateBill(Ticket ticket);
}
