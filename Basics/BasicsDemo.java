package Basics;

import java.util.Scanner;

/**
 * Demonstrates basic Java concepts: Input/Output, Type Casting, and Type Promotion.
 */
public class BasicsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 1. Automatic (Widening) Type Casting ===");
        System.out.print("Enter an integer value: ");
        int intVal = sc.nextInt();
        float floatVal = intVal; // Automatic casting from int to float
        System.out.println("Integer value: " + intVal);
        System.out.println("Auto-casted Float value: " + floatVal);

        System.out.println("\n=== 2. Explicit (Narrowing) Type Casting ===");
        System.out.print("Enter two float numbers to add: ");
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        int sumInt = (int) (f1 + f2); // Explicit casting from float sum to int
        System.out.println("Exact Float Sum: " + (f1 + f2));
        System.out.println("Explicitly Casted Int Sum: " + sumInt);

        System.out.println("\n=== 3. Type Promotion in Expressions ===");
        byte a = 20;
        byte b = 30;
        byte c = 100;
        // byte values get promoted to int during arithmetic operations
        int result = (a * b * c);
        System.out.println("Result of byte expression (promoted to int): " + result);

        sc.close();
    }
}
