package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size for the array: ");
        int size = scan.nextInt();
        int[] myArray = new int[size];
        int counter=1;
        do {
            System.out.println("Enter the "+counter+". "+ "element");
            myArray[counter-1]=scan.nextInt();
            counter++;
        }while (counter<=size);

        int smallest =  Integer.MAX_VALUE;

        for (int i = size - 1; i >= 0; i--) {
            if (myArray[i] < smallest&&myArray[i]%3==0) {
                smallest = myArray[i];
            }

        }System.out.println("The smallest multiple of 3 is "+smallest);
    }}
