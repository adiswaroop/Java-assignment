interface Payment {
    void pay(double amount);
    default void receipt() {
        System.out.println("Payment Successfull. Receipt generated");
    }
}

class CreditCardPayment implements Payment {
    long creditCardNumber;

    public CreditCardPayment(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Amount paid: "+ amount + " using cardnumber: " + this.creditCardNumber);
    }
}   

class UPIPayment implements Payment {
    long upiId;

    public UPIPayment(long upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount paid: "+ amount + " using upi Id: " + this.upiId);
    }
}

public class Prog10 {
    static public void main(String[] args) {
        Payment[] paymentArray = {
            new CreditCardPayment(892834898),
            new UPIPayment(23673),
            new CreditCardPayment(748937494),
            new UPIPayment(23687)
        };

        for (Payment p: paymentArray) {
            p.pay(250.0);
            p.receipt();
        }
    } 
}