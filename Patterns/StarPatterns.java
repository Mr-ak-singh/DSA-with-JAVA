package Patterns;

/**
 * Implementation of various star (*) pattern printing algorithms using nested loops.
 */
public class StarPatterns {

    // 1. Solid Square Pattern (N x N)
    public static void printSolidSquare(int n) {
        System.out.println("=== 1. Solid Square (" + n + "x" + n + ") ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Hollow Square Pattern
    public static void printHollowSquare(int n) {
        System.out.println("=== 2. Hollow Square (" + n + "x" + n + ") ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 3. Right Half Pyramid
    public static void printRightHalfPyramid(int n) {
        System.out.println("=== 3. Right Half Pyramid ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 4. Reverse Right Half Pyramid
    public static void printReverseRightHalfPyramid(int n) {
        System.out.println("=== 4. Reverse Right Half Pyramid ===");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 5. Left Half Pyramid
    public static void printLeftHalfPyramid(int n) {
        System.out.println("=== 5. Left Half Pyramid ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 6. Reverse Left Half Pyramid
    public static void printReverseLeftHalfPyramid(int n) {
        System.out.println("=== 6. Reverse Left Half Pyramid ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 7. Rhombus Pattern
    public static void printRhombus(int n) {
        System.out.println("=== 7. Rhombus Pattern ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printSolidSquare(n);
        System.out.println();
        printHollowSquare(n);
        System.out.println();
        printRightHalfPyramid(n);
        System.out.println();
        printReverseRightHalfPyramid(n);
        System.out.println();
        printLeftHalfPyramid(n);
        System.out.println();
        printReverseLeftHalfPyramid(n);
        System.out.println();
        printRhombus(n);
    }
}
