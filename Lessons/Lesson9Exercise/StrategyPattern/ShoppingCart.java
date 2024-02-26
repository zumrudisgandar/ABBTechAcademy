import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int calculateTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void pay(PayStrategy payStrategy) {
        int total = calculateTotal();
        System.out.println("Total amount to pay: " + total);
        payStrategy.collectPaymentDetails();
        boolean isSuccess = payStrategy.pay(total);
        if (isSuccess) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed. Please try again.");
        }
    }
}
