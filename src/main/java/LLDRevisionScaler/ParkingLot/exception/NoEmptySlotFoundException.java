package LLDRevisionScaler.ParkingLot.exception;

public class NoEmptySlotFoundException extends RuntimeException{

    public NoEmptySlotFoundException(){
        super();
    }

    public NoEmptySlotFoundException(String message){
        super(message);
    }
}
