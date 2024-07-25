/*
 * Write a code in java to print the greatest and the smallest number of all the numbers entered by the user.
 */
import java.util.*;
public class greatest_smallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt(); // taking the length of the array input
        int[] arr = new int[n]; // array creation

        // taking the array elements input
        System.out.println("Enter the array elements : ");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr); //  using arrays class to sort the array. Array class is invoked by default from the java.util package.
        System.out.println("The greatest number is : " + arr[n - 1] + "\nThe smallest number is : " + arr[0]);

        in.close();
    }
}

// alternative logic to find the greatest and the smallest without using Arrays.sort()
/*
 * int max = arr[0], min = arr[0];
 * for(int i = 1; i < n; i++) {
 *      if(arr[i] > max) {
 *              max = arr[i];
 *      }
 *      if(arr[i] < min) {
 *              min = arr[i];
 *      }
 * }
 * 
 * System.out.println("The greatest number is : " + max + "\nThe smallest number is : " + min);
 */