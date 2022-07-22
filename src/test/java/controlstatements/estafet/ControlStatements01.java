package controlstatements.estafet;

import java.util.Scanner;

public class ControlStatements01 {

    public static void main(String[] args) {

        // Enter 2 different numbers from the console and print them in ascending order

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();

        // 1. Using If statement
        if (a>b){
            System.out.println("The numbers in ascending order are: "+b+", "+a);
        } else if (a<b) {
            System.out.println("The numbers in ascending order are: "+a+", "+b);
        } else {
            System.out.println("The numbers "+a+"and "+b+" are equal");
        }

        // Using ternary
        String ifTrue = String.format("The numbers in ascending order are %d,%d", b,a);
        String ifFalse = String.format("The numbers in ascending order are %d,%d",a,b);
        String statement = (a > b) ? ifTrue : ifFalse;
        System.out.println(statement);

        scan.close();

    }
}
