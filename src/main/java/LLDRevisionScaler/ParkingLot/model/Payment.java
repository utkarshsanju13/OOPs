package LLDRevisionScaler.ParkingLot.model;

import java.time.LocalDateTime;

public class Payment {

    private int id;
    private LocalDateTime paymentTime;
    private String referenceNumber;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private Bill bill;
    private int amount;

    public Payment() {
    }

    public Payment(int id, LocalDateTime paymentTime, String referenceNumber, PaymentStatus paymentStatus, PaymentMode paymentMode, Bill bill) {
        this.id = id;
        this.paymentTime = paymentTime;
        this.referenceNumber = referenceNumber;
        this.paymentStatus = paymentStatus;
        this.paymentMode = paymentMode;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
