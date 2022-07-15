package arrays;

import java.util.Scanner;

public class Arrays05 {
    public static void main(String[] args) {

        //Read an array from the console and check if it is mirrored.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size for the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        int counter=1;
        do {
            System.out.println("Enter the "+counter+". "+ "element");
            array[counter-1]=scan.nextInt();
            counter++;
        }while (counter<=size);

        int flag=0;
        for (int i = 0;i<=array.length/2 && array.length!=0; i++) {
            if (array[i]!=array[array.length-i-1]) {
                flag=1;
                break;
            }
        }
        if (flag==1) {
            System.out.println("The array is not mirrored.");}
        else {
            System.out.println("The array is mirrored.");
        }
    }
}
