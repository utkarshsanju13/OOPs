package OOPs_Interface;

public class ICICIBank implements  IBankAPI{

    @Override
    public void getBalance() {
        System.out.println("get Balance From ICICIBank");
    }

    @Override
    public void sendMoney() {
        System.out.println("sendMoney From ICICIBank");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("withdrawMoney From ICICIBank");

    }
}
