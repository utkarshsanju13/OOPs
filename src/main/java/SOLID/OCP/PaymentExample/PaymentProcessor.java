package SOLID.OCP.PaymentExample;

public abstract class PaymentProcessor {

//    PaymentProcessor(){
//        System.out.println("Payment processor class constructor...");
//    }

    PaymentProcessor(String medium){
        System.out.println("Medium Payment processor class constructor...");
    }

    public abstract void processPayment(double amount);
}
