package Conditionals_And_Loops;

import java.util.Scanner;

/**
 * Demonstrates Java Conditional logic: if-else, switch case, and grading system.
 */
public class ConditionalsDemo {

    // Check if number is even or odd
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Check voting eligibility
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    // Find maximum of three numbers
    public static int findMaxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }

    // Print month name using switch case
    public static String getMonthName(int monthNum) {
        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month Number (Enter 1-12)";
        };
    }

    // Assign grades based on marks range
    public static String getGrade(int marks) {
        if (marks >= 91 && marks <= 100) return "AA";
        if (marks >= 81 && marks <= 90) return "AB";
        if (marks >= 71 && marks <= 80) return "BB";
        if (marks >= 61 && marks <= 70) return "BC";
        if (marks >= 51 && marks <= 60) return "CD";
        if (marks >= 41 && marks <= 50) return "DD";
        return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 1. Even or Odd ===");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isEven(num) ? "Even" : "Odd"));

        System.out.println("\n=== 2. Voting Eligibility ===");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(isEligibleToVote(age) ? "Eligible to vote!" : "Not eligible to vote.");

        System.out.println("\n=== 3. Maximum of 3 Numbers ===");
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        System.out.println("Maximum number is: " + findMaxOfThree(x, y, z));

        System.out.println("\n=== 4. Switch Case Month Lookup ===");
        System.out.print("Enter month number (1-12): ");
        int m = sc.nextInt();
        System.out.println("Month: " + getMonthName(m));

        System.out.println("\n=== 5. Student Grading System ===");
        System.out.print("Enter student marks (0-100): ");
        int marks = sc.nextInt();
        System.out.println("Grade: " + getGrade(marks));

        sc.close();
    }
}
