package calculators;

public interface Calculator {
    double sum(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b) throws ArithmeticException; // Handle division by zero
}
