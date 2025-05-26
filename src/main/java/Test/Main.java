package Test;
class gali{
    int gali_no;

    public int getGali_no() {
        return gali_no;
    }

    public void setGali_no(int gali_no) {
        this.gali_no = gali_no;
    }

    public gali(int gali_no) {
        this.gali_no = gali_no;
    }

    @Override
    public String toString() {
        return "gali{" +
                "gali_no=" + gali_no +
                '}';
    }
}
class Address {
    gali gali_no;
    String address;

    public Address(gali gali_no, String address) {
        this.gali_no = gali_no;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public gali getGali_no() {
        return gali_no;
    }

    public void setGali_no(gali gali_no) {
        this.gali_no = gali_no;
    }

    @Override
    public String toString() {
        return "Address{" +
                "gali_no=" + gali_no +
                ", address='" + address + '\'' +
                '}';
    }
}

class Emp{
    Address address;

    public Emp(Address adress) {
        this.address = adress;
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address adress) {
        this.address = adress;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {

       Emp e1 = new Emp(new Address(new gali(61),"1/M pushpanjali nagar"));
        System.out.println(e1);
        System.out.println(e1);
        System.out.println(e1);

        Address temp = e1.getAdress();
        temp.setGali_no(new gali(65));

        System.out.println(e1);
    }
}
