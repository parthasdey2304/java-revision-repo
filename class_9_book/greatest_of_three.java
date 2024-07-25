/*
 * Write a code in Java to find the greatest of three numbers without using conditional statements
 */

 import java.util.*;
 public class greatest_of_three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(a, Math.max(b, c));

        System.out.println("The greatest of the three numbers is: " + max);

        in.close();
    }
 }