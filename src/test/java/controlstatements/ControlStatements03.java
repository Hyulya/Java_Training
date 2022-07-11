import java.util.Scanner;

public class ControlStatements03 {
    public static void main(String[] args) {

         /* Display messages to the user and read 2 numbers from the keyboard A and B (optional - float, double).
         Then enter 3rd number C and check that it is between A and B.
         Display a message whether C is between A and B (use ternary operator - ?: )
          */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int a = scan.nextInt();
        System.out.println("Enter number B: ");
        int b = scan.nextInt();
        System.out.println("Enter number C: ");
        int c = scan.nextInt();

        // 1. With If statement
//        if (a < c && c < b) {
//            System.out.println("The number "+c+" is between "+a+" and "+b);
//        } else {
//            System.out.println("The number "+c+" is not between "+a+" and "+b);
//        }

        // 2. With ternary
        String ifTrue = "The number is between number A and number B";
        String ifFalse= "The number is not between number A and number B";
        String operation =(a < c && c < b) ? ifTrue : ifFalse;
        System.out.println(operation);

    }
}
