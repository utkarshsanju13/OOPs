package OOps1_Into_to_LLD_and_OOPs;

public class BankAccount {
    String accountNumber;
    int balance;
    double roi;

    double getSimpleInterest(int time){
        return (this.balance * this.roi * time)/100.00;
    }

    double getBalanceWithInterest(int time){
        return this.balance + (this.balance * this.roi * time)/100.00;
    }

    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        bk.balance  = 100;

    }

}
