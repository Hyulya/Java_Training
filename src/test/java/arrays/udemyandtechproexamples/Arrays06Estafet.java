package arrays.udemyandtechproexamples;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays06Estafet {

        /*
        From the console enter an array size that is a multiple of 2.
        Then enter half of the elements (depending on the size of the array).
        Set the second half of the array with values like the first half.
        Last - print the array.
         */

    public static void main(String[] args) {
        int size=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an even number:");
        do {
            size = scan.nextInt();
            if (size % 2 != 0)
                System.out.println("This is not an even number, please enter an even one");
        }
        while(size%2!=0);
        int[] myArray = new int[size];
        int counter=1;
        int counter2=0;
        do {
            System.out.println("Enter the "+counter+". "+ "element");
            myArray[counter-1]=scan.nextInt();
            counter++;
            if (counter==size/2+1){
                do{
                    myArray[counter-1]=myArray[counter2];
                    counter2++;
                    counter++;
                }while(counter2!=(size/2));
                System.out.println(Arrays.toString(myArray));
                break;
            }
        }while (true);
    }}

