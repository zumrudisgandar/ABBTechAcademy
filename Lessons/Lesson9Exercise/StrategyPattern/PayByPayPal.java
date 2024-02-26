
public class PayByPayPal implements PayStrategy {

    public boolean pay(int paymentAmount) {
        return true;
    }

    public void collectPaymentDetails() {
        System.out.println("Email of customer: zumrudisgandar@gmail.com");
    }
}
