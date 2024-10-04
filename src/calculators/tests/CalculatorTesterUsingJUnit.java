package calculators.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CalculatorClass; // Import the CalculatorClass

public class CalculatorTesterUsingJUnit {

    private CalculatorClass calculator;

    // Initialize CalculatorClass object before each test case
    @BeforeEach
    public void setUp() {
        calculator = new CalculatorClass();
    }

    // Test case for sum method
    @Test
    public void testSum() {
        double result = calculator.sum(10, 5);
        assertEquals(15, result, "Sum of 10 and 5 should be 15");
    }

    // Test case for subtract method
    @Test
    public void testSubtract() {
        double result = calculator.subtract(10, 5);
        assertEquals(5, result, "Subtracting 5 from 10 should be 5");
    }

    // Test case for multiply method
    @Test
    public void testMultiply() {
        double result = calculator.multiply(10, 5);
        assertEquals(50, result, "Multiplying 10 by 5 should be 50");
    }

    // Test case for divide method
    @Test
    public void testDivide() {
        double result = calculator.divide(10, 5);
        assertEquals(2, result, "Dividing 10 by 5 should be 2");
    }

    // Test case for divide by zero (expect an exception)
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        }, "Dividing by zero should throw an ArithmeticException");
    }
}
