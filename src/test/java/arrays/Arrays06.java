package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays06 {

    // Write a program that creates an array with 10 elements of type double and initializes each of the
    // elements with a value equal to the element index multiplied by 3. Print the elements on the screen.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 double values for the elements in an array:\r");
        double[] values = new double[10];
        for (double i = 0; i < 10; i++) {
            values[(int) i] = scan.nextDouble()*3; // ask the mentor
        }
        System.out.println("The array with the multiplied by 3 values is: " + Arrays.toString(values));
    } }

