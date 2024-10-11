package algorithms;

public class DivisibleDigitCounter {

    public int countDigits(int num) {
        int count = 0;
        int originalNum = num;

        // Convert num to a string to iterate over its digits
        String numStr = Integer.toString(num);

        // Loop through each digit in the string representation of num
        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);

            // Check if the digit divides num evenly
            if (originalNum % digit == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        DivisibleDigitCounter divisibleDigitCounter = new DivisibleDigitCounter();

        // Test case 1
        int num1 = 7;
        System.out.println("Number of digits in " + num1 + " that divide " + num1 + " is " + divisibleDigitCounter.countDigits(num1));  // Output: 1

        // Test case 2
        int num2 = 121;
        System.out.println("Number of digits in " + num2 + " that divide " + num2 + " is " + divisibleDigitCounter.countDigits(num2));  // Output: 2

        // Test case 3
        int num3 = 1248;
        System.out.println("Number of digits in " + num3 + " that divide " + num3 + " is " + divisibleDigitCounter.countDigits(num3));  // Output: 4
    }
}
