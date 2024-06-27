package OOPs_Interface;

public class Client {

    public static void main(String[] args) {

//        PhonePe phonePe = new PhonePe(new YesBank());
        PhonePe phonePe = new PhonePe(new ICICIBank());
        phonePe.sendMoney();
        phonePe.withdrawMoney();
        phonePe.getBalance();

    }

}
