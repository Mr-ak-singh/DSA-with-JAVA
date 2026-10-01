package Patterns;

/**
 * Implementation of various number-based pattern printing algorithms.
 */
public class NumberPatterns {

    // 1. Numbered Right Triangle
    public static void printNumberedRightTriangle(int n) {
        System.out.println("=== 1. Numbered Right Triangle ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 2. Inverted Numbered Triangle
    public static void printInvertedNumberedTriangle(int n) {
        System.out.println("=== 2. Inverted Numbered Triangle ===");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 3. Floyd's Triangle (1, 2 3, 4 5 6, ...)
    public static void printFloydsTriangle(int n) {
        System.out.println("=== 3. Floyd's Triangle ===");
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 4. 0-1 Binary Triangle Pattern
    public static void printZeroOneTriangle(int n) {
        System.out.println("=== 4. 0-1 Binary Triangle ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printNumberedRightTriangle(n);
        System.out.println();
        printInvertedNumberedTriangle(n);
        System.out.println();
        printFloydsTriangle(n);
        System.out.println();
        printZeroOneTriangle(n);
    }
}
