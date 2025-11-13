package SOLID.OCP.PaymentExample;

import Assignment.P;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new CreditCardPaymentProcessor("Credit card medium");
        paymentProcessor.processPayment(100.0);
    }
}
