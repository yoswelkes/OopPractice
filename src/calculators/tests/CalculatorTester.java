package calculators.tests;

import calculators.CalculatorClass;

public class CalculatorTester {

    public static void main(String[] args) {
        CalculatorClass calculator = new CalculatorClass();

        // Test sum method
        double sumResult = calculator.sum(10, 5);
        if (sumResult == 15) {
            System.out.println("Test sum: Passed");
        } else {
            System.out.println("Test sum: Failed. Expected 15, but got " + sumResult);
        }

        // Test subtract method
        double subtractResult = calculator.subtract(10, 5);
        if (subtractResult == 5) {
            System.out.println("Test subtract: Passed");
        } else {
            System.out.println("Test subtract: Failed. Expected 5, but got " + subtractResult);
        }

        // Test multiply method
        double multiplyResult = calculator.multiply(10, 5);
        if (multiplyResult == 50) {
            System.out.println("Test multiply: Passed");
        } else {
            System.out.println("Test multiply: Failed. Expected 50, but got " + multiplyResult);
        }

        // Test divide method
        double divideResult = calculator.divide(10, 5);
        if (divideResult == 2) {
            System.out.println("Test divide: Passed");
        } else {
            System.out.println("Test divide: Failed. Expected 2, but got " + divideResult);
        }

        // Test divide by zero
        try {
            calculator.divide(10, 0);
            System.out.println("Test divide by zero: Failed. Expected ArithmeticException.");
        } catch (ArithmeticException e) {
            System.out.println("Test divide by zero: Passed");
        }
    }
}
