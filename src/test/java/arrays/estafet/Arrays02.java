package arrays.estafet;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        /*
        Read an array from the console and find the smallest number a multiple of 3 from the array.
        If there is no such number, print an appropriate message.
        */

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
        }
        if (smallest%3!=0) {
            System.out.println("There's no number multiply of 3");
        } else {
            System.out.println("The smallest multiple of 3 is " + smallest);
        }
        scan.close();
    }}
