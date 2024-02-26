import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        // Add items to the shopping cart
        cart.addItem(new Item("Laptop", 3000));
        cart.addItem(new Item("Phone", 2000));

        System.out.println("Please, write the name of the method you want to pay: " + "\n" + "1. Paypal" + "\n" + "2. Credit Card");
        String paymentMethod = sc.nextLine();
        if (paymentMethod.toLowerCase().equals("paypal")) {
            cart.pay(new PayByPayPal());
        } else if (paymentMethod.toLowerCase().equals("credit card")) {
            cart.pay(new PayByCreditCard());
        } else {
            System.out.println("Opps! No such payment method.");
        }
    }
}
