package controlstatements.udemyandtechproexamples;

import java.util.Scanner;

public class ControlStatements01Udemy {
    public static void main(String[] args) {
        /* Create a new switch statement using char instead of int (use Scanner class)
        Create a new char variable
        Create a switch statement testing for
        A,B,C,D, or E
        Display a message if any of these are found and then break
        Add a default which displays a message saying not found
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char c = scan.next().charAt(0);

        switch (c) {
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(c+ " is found");
                break;
            default:
                System.out.println("It's different from A,B,C,D or E");
                break;
        }

        // We can use a string as well - the tricky point here is the le
        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
        }

    }
}
