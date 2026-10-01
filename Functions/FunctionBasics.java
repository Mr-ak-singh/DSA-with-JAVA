package Functions;

/**
 * Basic helper functions for arithmetic, averages, and summation.
 */
public class FunctionBasics {

    // Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Calculate average of 3 numbers
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    // Sum of all odd numbers from 1 to N
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    // Sum of first N natural numbers using formula: N * (N + 1) / 2
    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Addition & Multiplication ===");
        System.out.println("Add 15 + 25 = " + add(15, 25));
        System.out.println("Multiply 12 * 8 = " + multiply(12, 8));

        System.out.println("\n=== 2. Average of 3 Numbers ===");
        System.out.printf("Average of (10, 20, 30) = %.2f\n", average(10, 20, 30));

        System.out.println("\n=== 3. Sum of Odd Numbers (1 to 10) ===");
        System.out.println("Sum = " + sumOfOddNumbers(10));

        System.out.println("\n=== 4. Sum of First 10 Natural Numbers ===");
        System.out.println("Sum = " + sumOfNaturalNumbers(10));
    }
}
