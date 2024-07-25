/*
 * Write a code in java to find the tariff of the tax based on the following chart
 * +-----------------------------------------+
 * |     Distance      |         Rate        |
 * |-------------------|---------------------|
 * |     Upto 5 km     |    100 Rs Fixed     |
 * |  For next 10 km   |       Rs. 10/km     |
 * |  For next 10 km   |       Rs. 8/km      |
 * |  More than 25 km  |       Rs. 5/km      |
 * +-----------------------------------------+
 */

import java.util.Scanner;
public class taxi_charges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the distance covered in kilometers : ");
        int distance = in.nextInt();
        int amount;

        if(distance <= 5) {
            amount = 100;
        } else if(distance > 5 && distance <= 15) {
            amount = 100 + ((distance - 5) * 10);
        } else if(distance > 15 && distance <= 15) {
            amount = 100 + ((distance - 15) * 8) + (10 * 10);
        } else {
            amount = 100 + ((distance - 25) * 5) + (8 * 10) + (10 * 10);
        }

        System.out.println("The taxi tariff is : Rs." + amount);

        in.close();
    }
}