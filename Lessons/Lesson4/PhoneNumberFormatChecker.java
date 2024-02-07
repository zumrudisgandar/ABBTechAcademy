package Lesson4.Lesson4Exercise;

import java.util.Scanner;

public class PhoneNumberFormatChecker {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your phone number format(+994-50-869-75-23): " );
        String phoneNumber = sc.next();
        try {
            PhoneNumber newPhoneNumber = new PhoneNumber(phoneNumber);
            newPhoneNumber.setPhoneNumber(phoneNumber);
        } catch (IllegalArgumentException e) {
            System.out.println("Provided phone number is invalid: " + e.getMessage());
        }

    }
}
