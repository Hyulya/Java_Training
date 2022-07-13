package controlstatements;

import java.util.Scanner;

public class ControlStatements04 {
    public static void main(String[] args) {
        /*
        Enter 3 variables from the console - hour (integer type), money (float), isHealthy - Boolean type.
        Create a program that makes decisions on the basis of these data as follows:

        If I'm sick:
         -If it’s after 9 PM I won't go out
         -If I have money I will buy medicine
         -if I don't have money - I will stay at home and drink tea

        if I'm healthy:
         -if I have between BGN 1 and 10 - I will go for coffee
         -if they are more than 10 leva - party all night
         -if I don't have 1 lev - I will stay at home and play games.

        Display the resulting solution as a message in the console.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you fine? --> Enter true/false");
        boolean isHealthy = scan.nextBoolean();
        System.out.println("What time is it? --> Enter a number");
        int hour = scan.nextInt();
        System.out.println("How much money do you have? --> Enter the amount");
        float money = scan.nextFloat();

        if (!isHealthy){
            System.out.println("I'm sick");
            if (hour>=9 && hour<=12) {
                System.out.println("It's after 9pm and I won't go out");
            } else if (money>1) {
                System.out.println("I have money and I will buy medicine");
            } else {
                System.out.println("I don't have money and I will stay at home and drink tea");
            }
        } else {
            System.out.println("I'm healthy.");
            if (money>=1 && money<=10) {
                System.out.println("I have between 1 - 10 leva, I will go for coffee");
            } else if (money>10) {
                System.out.println("I have more than 10 leva, I will party all night");
            } else if (money==0) {
                System.out.println("I have no money, so I will stay at home and play games");
            }
        }
        scan.close();
    }
}
