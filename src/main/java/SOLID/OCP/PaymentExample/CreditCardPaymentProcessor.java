package SOLID.OCP.PaymentExample;

public class CreditCardPaymentProcessor extends PaymentProcessor{

    public String medium;

    CreditCardPaymentProcessor(){
        super("credit card medium from default contructor of CreditCardProcessor");
        System.out.println("Credit Card Payment processor...");
    }

    CreditCardPaymentProcessor(String medium){
        super("credit card medium");
        this.medium = medium;
    }


    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card Payment processor class implementation");
    }
}
