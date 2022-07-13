package loops;

public class Loops01 {
    public static void main(String[] args) {

        // Display the numbers from -20 to 50.

        // 1. With For loop
        for (int i = -20; i <= 50; i++) {
            System.out.println(i);
        }

        // 2. With For While loop
        int k = -20;
        while (k <= 50) {
            System.out.println(k);
            k++;
        }

        // Display all odd numbers from -10 to 10

        // 1. With For loop
        for (int y = -10; y <= 10; y++) {
            if (y % 2 != 0)
                System.out.println(y);
        }

        // 2. With For While loop
        int m = -10;
        while (m <= 10) {
            if (m % 2 != 0)
                System.out.println(m);
            m++;
        }

        // Display the numbers 10 to 1 (reverse order)

        // 1. With For loop
        for (int z = 10; z >= 1; z--) {
            System.out.println(z);
        }

        // 2. With For While loop
        int n = 10;
        while (n >= 1) {
            System.out.println(n);
            n--;
        }

    }
}
