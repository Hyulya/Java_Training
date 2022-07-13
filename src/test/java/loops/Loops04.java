package loops;

public class Loops04 {
    public static void main(String[] args) {

        // Display the numbers between 1 and 20 skipping the numbers between 8 and 15 (use continue)

        for (int i = 1; i<=20; i++) {
            if (i>=8 && i<=15)
                continue;
            System.out.println(i);
        }
    }
}
