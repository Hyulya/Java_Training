package loops;

public class Loops07Udemy {
    public static void main(String[] args) {

        /* Using the for statement, call the calculateInterest method with
        the amount of 10000 with an interestRate of 2,3,4,5,6,7,and 8
        and print the result to the console
         */

        for (int interestRate = 2; interestRate <= 8; interestRate++) {
            System.out.println("10000 at " + interestRate + " interest % is " + calculatedInterest(10000, interestRate));
        }

        System.out.println("*** Next task ***");

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        for (int interestRate = 8; interestRate >= 2; interestRate--) { //String format is used to make sure we have consistency with 2 digits after the number:
            System.out.println("10000 at " + interestRate + " interest % is " + String.format("%.2f", calculatedInterest(10000, interestRate)));
        }

        System.out.println("*** Next task ***");

        /*
        Create a for statement using any range of numbers
        Determine if the number is a prime number using isPrime method
        If it is a prime number, print it out AND increment a count of the number of prime numbers found
        If that count is 3 exit the for loop
        hint: Use the break; statement to exit
        */

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculatedInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
