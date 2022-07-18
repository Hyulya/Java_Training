package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {

        //Enter a number from the console then create an array of 10 elements as follows:
        // the first 2 elements of the array are the entered number.
        // Each next element of the array is equal to the sum of the previous 2 elements.
        // Then output the array to the console.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int firstNumber = scan.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (i < 2) {
                array[i] = firstNumber;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
