package OOPs_Interface;

public class PhonePe {

    public IBankAPI iBankAPI;

    public PhonePe(IBankAPI iBankAPI){
        this.iBankAPI = iBankAPI;
    }

    public void sendMoney(){
        iBankAPI.sendMoney();
    }

    public void withdrawMoney(){
        iBankAPI.withdrawMoney();
    }

    public void getBalance(){
        iBankAPI.getBalance();
    }
}
