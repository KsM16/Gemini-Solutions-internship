package Assignment1;

public class Q12Payments {
    public static void main(String[] args) {

        //credit card payment

        CreditCardPayment cc = new CreditCardPayment("123");
        cc.printUser();
        cc.getPaymentType();
        cc.connect();
        cc.makePayment(15500);
        cc.refund(1234);
        cc.disconnect();

        //UPIPayment
        UPIPayment upi = new UPIPayment("999");
        upi.printUser();
        upi.getPaymentType();
        upi.connect();
        upi.makePayment(7777);
        upi.disconnect();
    }
}
interface PaymentGateway{    //interface
    void connect();
    boolean makePayment(double amount);
    void disconnect();
}
// 2nd interface
interface Refundable {
    boolean refund(double amount);
}

//abstract class
abstract class PaymentMethod {
    protected String userId;

    public PaymentMethod(String id) {
        this.userId = id;
    }

    public abstract String getPaymentType();

    public void printUser() {
        System.out.println("userID is " + userId);
    }
}


class CreditCardPayment extends PaymentMethod implements PaymentGateway, Refundable {
    public CreditCardPayment(String userId) {
        super(userId);
    }
    public void connect() { //1st interface
        System.out.println("connecting to server");
    }
    // 1st interface
    public boolean makePayment(double amount) {
        System.out.println("payment " + amount);
        return true;
    }
    //1st interface
    public void disconnect() {
        System.out.println("disconnecting");
    }
    //abstract class
    public String getPaymentType() {
        return "cash";
    }
    //2nd interface
    public boolean refund(double amount) {
        System.out.println("refund " + amount);
        return true;
    }
}

class UPIPayment extends PaymentMethod implements PaymentGateway {
    public UPIPayment(String userId) {
        super(userId);
    }
    // abstract class
    public String getPaymentType() {
        return "UPI";
    }
    //1st interface
    public void connect() {
        System.out.println("connecting to server");
    }
    //1st interface
    public boolean makePayment(double amount) {
        System.out.println("payment " + amount);
        return true;
    }
    //1st interface
    public void disconnect() {
        System.out.println("disconnecting");
    }
}