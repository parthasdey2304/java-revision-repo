/*
 * Write a code in java to find if a number is a perfect square or not.
 */
import java.util.Scanner;
public class perfect_squares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        boolean negative = false;

        if(n < 0) {
            System.out.println("The square root of a negative number is not possible. So using complex numbers.");
            n = n * -1;
            negative = true;
        }

        for(int i = 0; i <= n; i++) {
            if(i * i == n) {
                System.out.println("The number is perfect square.\nSquare root = " + (int)Math.sqrt(n) + ((negative)? "i" : ""));
                System.exit(0);
            }
        }

        System.out.println("The number is not a perfect square.");

        in.close();
    }
}