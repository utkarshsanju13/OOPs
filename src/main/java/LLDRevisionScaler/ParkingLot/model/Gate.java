package LLDRevisionScaler.ParkingLot.model;

public class Gate {

    private int id;
    private GateType gateType;
    private String operator;
//    private GateStatus gateStatus;

    public Gate(int id, GateType gateType, String operator) {
        this.id = id;
        this.gateType = gateType;
        this.operator = operator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
