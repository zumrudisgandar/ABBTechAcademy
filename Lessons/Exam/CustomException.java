class FileIOException extends Exception {
    public FileIOException(String message) {
        super(message);
    }
}

// Custom exception for invalid inventory item data
class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

// Custom exception for item not found in inventory
class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}