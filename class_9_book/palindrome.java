/*
 * Write a code in java to check if a number is palindrome number or not.
 */
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = in.nextInt();
		int copy = n, rev = 0, d;

		while(n != 0) {
			d = n % 10;
			rev = rev * 10 + d;
			n /= 10;
		}

		if(rev == copy) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not Palindrome number");
		}

		in.close();
	}
}
