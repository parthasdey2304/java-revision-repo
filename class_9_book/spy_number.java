/* Write a code in java to check if a number is spy number or not */

import java.util.Scanner;
public class spy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = in.nextInt();
		int sum = 0, pro = 1;

		while(n != 0) {
			int d = n % 10;
			sum += d;
			pro *= d;
			n /= 10;
		}

		if(sum == pro) {
			System.out.println("Spy Product number");
		} else {
			System.out.println("Not Spy Product number");
		}

		in.close();
	}
}
