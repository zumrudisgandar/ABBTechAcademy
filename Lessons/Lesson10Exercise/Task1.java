import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int input = 0;

        while(!flag) {
            try{
                input = sc.nextInt();
                System.out.println(input * input);
                flag = true;
            } catch(Exception ex) {
                System.out.println("You have to enter a valid integer.");
                sc.nextLine();
            }
        }
    }
}
