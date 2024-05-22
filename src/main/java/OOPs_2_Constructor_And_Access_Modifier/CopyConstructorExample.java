package OOPs_2_Constructor_And_Access_Modifier;

public class CopyConstructorExample {

    public static void main(String[] args) {

        Fruit f = new Fruit(20,"mango","Summer");

        System.out.println("org fruit:" + f.getFprice() + " "+ f.getFname() + " "+ f.getFseason());

        Fruit f2 = new Fruit(f);
        System.out.println("copy fruit:" + f2.getFprice() + " "+ f2.getFname() + " "+ f.getFseason());
    }

}

class Fruit{


    private int fprice;
    private String fname;

    public String getFseason() {
        return fseason;
    }

    private final String fseason;

    public Fruit(int fprice, String fname, String fseason){
        this.fname = fname;
        this.fprice = fprice;
        this.fseason = fseason;
    }

    //COpy Constructor
    //Note: the final variable can also be initialized by the copy constructor as this is the drawback of clone()
    public Fruit(Fruit f){

        this.fprice = f.fprice;
        this.fname = f.fname;
        this.fseason = f.fseason;
    }

    public int getFprice() {
        return fprice;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setFprice(int fprice) {
        this.fprice = fprice;
    }
}
