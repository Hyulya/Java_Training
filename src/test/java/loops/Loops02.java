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
    }
}