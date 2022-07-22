package loops.estafet;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

       // Read a number from the console and display the sum of all numbers between 1 and the entered number.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scan.nextInt();
        int sum=0;

        System.out.println("The result is: ");
        for (int i=1; i<=a; i++) {
            sum=sum+i;
        }
        System.out.println(sum);

        scan.close();
    }
}
