class InventoryItem {

    private int id;
    static private int idCounter = 0;
    private String name;
    private int quantity;
    private double price;

    // Increment ID automatically to make it unique.
    public InventoryItem(String name, int quantity, double price) {
        this.id = ++idCounter;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display inventory item details
    @Override
    public String toString() {
        return "InventoryItem{" +
                "itemId=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}