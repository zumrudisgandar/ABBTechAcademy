import java.util.Scanner;


public class CustomException{
    static int belowLimit = 18;
    static int aboveLimit = 30;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Enter age between " + belowLimit + " and " + aboveLimit + ":");
        try{
            userInput = sc.nextInt();
            checkInput(userInput);
            System.out.println("Successful! Input is within the specified range.");
        } catch(InvalidInputException invalidInputException) {
            System.out.println("Invalid input: " + invalidInputException.getMessage());
        }
    }
    public static void checkInput(int age) throws InvalidInputException {
        if (age < belowLimit || age > aboveLimit) {
            throw new InvalidInputException("User input is not within the specified range!");
        }
    }
}
