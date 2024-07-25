/* Write a program in java to print the fibonacci series.*/
import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of terms : ");
		int n = in.nextInt();
		int a = 0, b = 1, c = 0;

		System.out.print("Fibonacci series : 0, 1, ");
		for(int i = 1; i <= n - 2; i++) {
			c = a + b;
			System.out.print(c +", ");
			a = b; b = c;
		}

		in.close();
	}
}
