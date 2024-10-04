package calculators;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorClass();

        // Testing Sum
        System.out.println("Sum of 10 and 5: " + calculator.sum(10, 5));

        // Testing Subtract
        System.out.println("Subtract 10 from 5: " + calculator.subtract(10, 5));

        // Testing Multiply
        System.out.println("Multiply 10 by 5: " + calculator.multiply(10, 5));

        // Testing Divide
        try {
            System.out.println("Divide 10 by 5: " + calculator.divide(10, 5));
            System.out.println("Divide 10 by 0: " + calculator.divide(10, 0));  // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
