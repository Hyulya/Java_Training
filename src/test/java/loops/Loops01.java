package loops;

public class Loops01 {
    public static void main(String[] args) {

        // Display the numbers from -20 to 50.
        for (int i=-20 ; i<=50; i++){
            System.out.println(i);
        }

        // Display all odd numbers from -10 to 10
        for (int y=-10 ; y<=10 ; y++) {
            if (y%2!=0)
                System.out.println(y);
        }

        // Display the numbers 10 to 1 (reverse order)
        for (int z=10; z >=1; z--) {
            System.out.println(z);
        }
    }
}
