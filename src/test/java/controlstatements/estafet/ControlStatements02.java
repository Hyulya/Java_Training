package controlstatements.estafet;

import java.util.Scanner;

public class ControlStatements02 {
    public static void main(String[] args) {

        // Enter 3 different numbers from the console and print them in descending order.

        // Using If statement
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();
        System.out.println("Enter third number: ");
        int c = scan.nextInt();

        if (a>=b && a>=c){
            if (b>=c) {
                System.out.println("The numbers in descending order: "+a+" ,"+b+" ,"+c);
            } else {
                System.out.println("The numbers in descending order: "+a+" ,"+c+" ,"+b);
            }
        } else if (b>=c && b>=a) {
            if (a>=c){
                System.out.println("The numbers in descending order: "+b+" ,"+a+" ,"+c);
            } else {
                System.out.println("The numbers in descending order: "+b+" ,"+c+" ,"+a);
            }
        } else {
            if (a>=b){
                System.out.println("The numbers in descending order: "+c+" ,"+a+" ,"+b);
            } else {
                System.out.println("The numbers in descending order: "+c+" ,"+b+" ,"+a);
            }
        }
        {
        }
        scan.close();
    }
}
