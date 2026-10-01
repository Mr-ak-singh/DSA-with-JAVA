package Conditionals_And_Loops;

import java.util.Scanner;

/**
 * Demonstrates loop problems: sum until 0, largest until 0, Fibonacci series, and digit operations.
 */
public class LoopsDemo {

    // Print Fibonacci series up to N terms
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Subtract product and sum of digits of an integer (e.g. 234 -> Product=24, Sum=9 -> Ans=15)
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            sum += digit;
            temp /= 10;
        }
        return product - sum;
    }

    // Sum user inputs continuously until user enters 0
    public static void sumUntilZero(Scanner sc) {
        int sum = 0;
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == 0) break;
            sum += val;
        }
        System.out.println("Total Sum: " + sum);
    }

    // Find largest from user inputs continuously until user enters 0
    public static void largestUntilZero(Scanner sc) {
        int max = Integer.MIN_VALUE;
        System.out.println("Enter numbers to find max (enter 0 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == 0) break;
            if (val > max) {
                max = val;
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest Number: " + max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 1. Fibonacci Series ===");
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        printFibonacci(n);

        System.out.println("\n=== 2. Subtract Product and Sum of Digits ===");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Result (Product - Sum): " + subtractProductAndSum(num));

        System.out.println("\n=== 3. Interactive Sum Until 0 ===");
        sumUntilZero(sc);

        System.out.println("\n=== 4. Interactive Largest Until 0 ===");
        largestUntilZero(sc);

        sc.close();
    }
}
