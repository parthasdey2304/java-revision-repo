/*
 * Write a code in java to categorize a triangle based on the angles into acute, obtuse or right angled triangle, and check if a triangle is possible with the given angles
 */

import java.util.Scanner;
public class triangle_type_angle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the three angles of the triangle: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if((a + b + c) != 180) {
            System.out.println("The triangle is not possible with the given angles.");
            System.exit(0);
        }

        if(a == 90 || b == 90 || c == 90) {
            System.out.println("The triangle is a right angled triangle.");
        } else if(a > 90 || b > 90 || c > 90) {
            System.out.println("The triangle is an obtuse angled triangle.");
        } else {
            System.out.println("The triangle is an acute angled triangle.");
        }

        in.close();
    }
}