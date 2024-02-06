package Lesson4.Lesson4Exercise;

import java.util.Scanner;

public class ProductTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter name of a product: ");
        String productName = sc.next();
        Product newProduct = new Product(productName);
        System.out.println("Company name: " + newProduct.getCompanyName());
        System.out.println("Product ID: " + newProduct.getProductID());
        System.out.println("Product name: " + newProduct.getProductName());
    }
}
