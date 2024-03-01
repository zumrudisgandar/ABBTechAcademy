import java.io.*;
import java.util.ArrayList;
import java.util.List;

class InventoryManager {
    private static final String FILE_NAME = "text.TXT";

    // Read inventory items from file
    public List<InventoryItem> retrieveInventoryItems() throws FileIOException, InvalidDataException {
        List<InventoryItem> inventoryItems = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split(",");
                if (attributes.length != 4) {
                    throw new InvalidDataException("Invalid data format in the file");
                }
                String name = attributes[1];
                int quantity = Integer.parseInt(attributes[2]);
                double price = Double.parseDouble(attributes[3]);
                InventoryItem item = new InventoryItem(name, quantity, price);
                inventoryItems.add(item);
            }
        } catch (IOException e) {
            throw new FileIOException("Cannot read the inventory file.");
        }
        return inventoryItems;
    }

    // Store inventory items into file
    public void storeInventoryItemsToFile(List<InventoryItem> items) throws FileIOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            for (InventoryItem item : items) {
                writer.write(item.getId() + "," + item.getName() + "," + item.getQuantity() + "," + item.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new FileIOException("Inventory can't be written to the file.");
        }
    }

    // Add a new inventory item
    public void addItem(InventoryItem item) throws FileIOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(item.getId() + "," + item.getName() + "," + item.getQuantity() + "," + item.getPrice());
            writer.newLine();
        } catch (IOException e) {
            throw new FileIOException("Item can't be added to the inventory file");
        }
    }

    // Find an inventory item by ID
    public InventoryItem findItem(int itemId) throws FileIOException, ItemNotFoundException, InvalidDataException {
        List<InventoryItem> inventoryItems = retrieveInventoryItems();
        for (InventoryItem item : inventoryItems) {
            if (item.getId() == itemId) {
                return item;
            }
        }
        throw new ItemNotFoundException("Item with ID " + itemId + " does not exits in the inventory.");
    }

    // Update an inventory item
    public void updateItem(InventoryItem newItem) throws FileIOException, ItemNotFoundException, InvalidDataException {
        List<InventoryItem> inventoryItems = retrieveInventoryItems();
        boolean exists = false;
        for (int i = 0; i < inventoryItems.size(); i++) {
            if (inventoryItems.get(i).getId() == newItem.getId()) {
                inventoryItems.set(i, newItem);
                exists = true;
                break;
            }
        }
        if (!exists) {
            throw new ItemNotFoundException("Item with ID " + newItem.getId() + " does not exits in the inventory");
        }
        storeInventoryItemsToFile(inventoryItems);
    }

    // Delete an inventory item by ID
    public void deleteItem(int itemId) throws FileIOException, ItemNotFoundException, InvalidDataException {
        List<InventoryItem> inventoryItems = retrieveInventoryItems();
        boolean exists = false;
        for (int i = 0; i < inventoryItems.size(); i++) {
            if (inventoryItems.get(i).getId() == itemId) {
                inventoryItems.remove(i);
                exists = true;
                break;
            }
        }
        if (!exists) {
            throw new ItemNotFoundException("Item with ID " + itemId + " does not exits in the inventory.");
        }
        storeInventoryItemsToFile(inventoryItems);
    }
}