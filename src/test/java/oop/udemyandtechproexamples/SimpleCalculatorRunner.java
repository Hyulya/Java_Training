package oop.udemyandtechproexamples;

public class SimpleCalculatorRunner {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(4);
        calculator.setSecondNumber(2);

        System.out.println("Adding the numbers = "+calculator.getAdditionResult());
        System.out.println("Subtracting the numbers = "+calculator.getSubtractionResult());
        System.out.println("Multiplying the numbers = "+calculator.getMultiplicationResult());
        System.out.println("Dividing the numbers = "+calculator.getDivisionResult());

    }
}
