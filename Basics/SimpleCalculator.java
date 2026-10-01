package Basics;

import java.util.Scanner;

/**
 * Basic math and financial calculations in Java.
 */
public class SimpleCalculator {

    // Calculate Simple Interest: (P * R * T) / 100
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Convert INR rupees to USD (approximate conversion rate 0.012)
    public static double currencyConverterInrToUsd(double rupees) {
        return rupees * 0.012;
    }

    // Perform arithmetic operation (+, -, *, /)
    public static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return 0;
                }
            default:
                System.out.println("Invalid Operator!");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Interest Calculator ===");
        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();
        System.out.println("Simple Interest = " + calculateSimpleInterest(p, r, t));

        System.out.println("\n=== Currency Converter (INR -> USD) ===");
        System.out.print("Enter amount in INR: ₹");
        double inr = sc.nextDouble();
        System.out.println("Amount in USD = $" + currencyConverterInrToUsd(inr));

        System.out.println("\n=== Basic Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.println("Result = " + calculate(num1, num2, op));

        sc.close();
    }
}
