package LLDRevisionScaler.ParkingLot.service.Strategy.BillCalculationStrategy;

import LLDRevisionScaler.ParkingLot.model.Bill;
import LLDRevisionScaler.ParkingLot.model.PaymentMode;
import LLDRevisionScaler.ParkingLot.model.PaymentStatus;
import LLDRevisionScaler.ParkingLot.model.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

public class SimpleBillCalculationStrategy implements BillCalculationStartegy{

    private int billCountId = 0;
    @Override
    public Bill calculateBill(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();

        long timediff = Duration.between(entryTime, exitTime).toMinutes();
        double amount = 10 * timediff;

        Bill bill = new Bill();
        bill.setId(billCountId++);
        bill.setExitTime(exitTime);
        bill.setAmount(amount);
        bill.setPaymentMode(PaymentMode.UPI);
        bill.setStatus(PaymentStatus.UNPAID);

        return bill;

    }
}
