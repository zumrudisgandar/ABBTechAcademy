package Lesson4.Lesson4Exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private String phoneNumber;

    // constructor
    PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getter & setter
    public void setPhoneNumber(String phoneNumber) {
        String regex = "^\\+994-(?:50|51|55|70|60)-\\d{3}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (phoneNumber.matches(regex)) {
            System.out.println("Provided phone number is valid: " + phoneNumber);
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("The phone number does not match the format criteria.");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
