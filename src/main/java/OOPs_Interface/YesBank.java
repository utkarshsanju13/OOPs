package OOPs_Interface;

public class YesBank implements  IBankAPI{
    @Override
    public void getBalance() {
        System.out.println("get Balance From YesBank");
    }

    @Override
    public void sendMoney() {
        System.out.println("sendMoney From YesBank");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("withdrawMoney From YesBank");

    }
}
