package loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {

        //Enter 2 numbers from the console. Display all numbers between them starting from the smaller one.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        // 1. With For loop
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("The entered numbers are equal!");
        }

        // 2. With While loop
        if (a < b) {
            int i=a;
            while (i<=b){
                System.out.println(i+" ");
                i++;
            }
        } else if (a > b) {
            int i = b;
            while (i <= a) {
                System.out.print(i + " ");
                i++;
            }
        } else {
            System.out.println("The entered numbers are equal!");
        }
        scan.close();
    }
}