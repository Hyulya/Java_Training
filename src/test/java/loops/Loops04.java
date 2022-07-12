package loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {

        // Starting with 3, display the first n numbers that are divisible by 3.
        // Numbers must be separated by commas. (hint - use keywords brake/continue)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        int currentNum = 3;

        for (int i = 1; i <= n; i++) {
            if (i == n) { //to remove the last comma
                System.out.println(currentNum);
                break;
            }
            System.out.print(currentNum + ",");
            currentNum += 3;
        }
    }
}
