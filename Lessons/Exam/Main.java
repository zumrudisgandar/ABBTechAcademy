import java.util.List;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        try {
            // Add operation
            InventoryItem newItem1 = new InventoryItem("Laptop", 10, 2500.0);
            InventoryItem newItem2 = new InventoryItem("Phone", 20, 1500.0);
            InventoryItem newItem3 = new InventoryItem("Monitor", 12, 800.0);

            manager.addItem(newItem1);
            manager.addItem(newItem2);
            manager.addItem(newItem3);

            // Read operation
            List<InventoryItem> items = manager.retrieveInventoryItems();
            System.out.println("Inventory Items:");
            for (InventoryItem item : items) {
                System.out.println(item);
            }

            // Update operation
//            InventoryItem updatedItem = new InventoryItem(1, "Laptop", 8, 3000.0);
//            manager.updateItem(updatedItem);
//            System.out.println("After update operation:");
//            items = manager.retrieveInventoryItems();
//            for (InventoryItem item : items) {
//                System.out.println(item);
//            }

            // Search operation
//            int searchId = 2;
//            try {
//                InventoryItem searchedItem = manager.findItem(searchId);
//                System.out.println("Searched Item by ID " + searchId + ":");
//                System.out.println(searchedItem);
//            } catch (ItemNotFoundException e) {
//                System.out.println("\n" + e.getMessage());
//            }

            // Delete operation
//            try {
//                manager.deleteItem(5);
//                System.out.println("\nInventory Items after deletion:");
//                items = manager.retrieveInventoryItems();
//                for (InventoryItem item : items) {
//                    System.out.println(item);
//                }
//            } catch (ItemNotFoundException e) {
//                  System.out.println("\n" + e.getMessage());
//            }

        } catch (FileIOException | InvalidDataException e) {
            e.printStackTrace();
        }
//        catch (ItemNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}