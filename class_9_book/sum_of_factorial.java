/* 
 * Write a code in java to find the sum of the factorial of the digits of the number.
 */
import java.util.Scanner;
public class sum_of_factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = in.nextInt();
		int fact, d, sum = 0;

		while(n != 0) {
			d = n % 10;
			fact = 1;
			for(int i = 1; i <= d; i++) {
				fact *= i;
			}

			sum += fact;
			n /= 10;
		}

		System.out.println("The sum of the factorials of the digits of the number is : " + sum);

		in.close();
	}
}
