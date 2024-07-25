/*
 * Write a code in java to check if a number is divisible by both 3 and 5 or not.
 */
import java.util.Scanner;
public class division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if(n % 3 == 0 && n % 5 == 0) {
            System.out.println("The number is both divisible by 3 and 5.");
        } else if(n % 3 == 0 && n % 5 != 0) {
            System.out.println("The number is divisible by 3 by not divisble by 5.");
        } else if(n % 3 != 0 && n % 5 == 0) {
            System.out.println("The number is not divisible by 3 but it is divisible by 5.");
        } else {
            System.out.println("The number is neither divisible by 3 nor by 5.");
        }

        in.close();
    }
}