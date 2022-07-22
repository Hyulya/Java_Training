package loops.estafet;

import java.util.Scanner;

public class Loops06 {
    public static void main(String[] args) {

        /*
        Read 2 numbers from the console A and B. Display all numbers from A to B of degree 2 (separated by commas).
        If a number is a multiple of 3,  a message saying that the number is skipped "skip 3" should be displayed.
        If the sum of all displayed numbers (excluding missed) become greater than 300, terminate the output.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number A:");
        int a = scan.nextInt();
        System.out.println("Enter number B:");
        int b = scan.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.print("skip " + i);
                if (i == b) {
                    break;
                }
                System.out.print(",");
            } else {
                sum=sum+(i*i);
                if (sum>300) {
                    break;
                }
                System.out.print(i * i);
                System.out.print(",");
            }
        }
        scan.close();
    }
}
