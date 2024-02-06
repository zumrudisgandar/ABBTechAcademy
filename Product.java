package Lesson4.Lesson4Exercise;

public class Product {
    static String companyName;
    int productID;
    String productName;

    // Static block
    static {
        companyName = "MyCompany";
    }

    // Non-static block
    {
        productID = 1000;
    }

    // constructor
    Product (String productName) {
        this.productName = productName;
        productID++; // increment by 1 for each new product created
    }

    // getter methods
    public String getCompanyName() {
        return companyName;
    }
    public int getProductID() {
        return productID;
    }
    public String getProductName() {
        return productName;
    }
}
