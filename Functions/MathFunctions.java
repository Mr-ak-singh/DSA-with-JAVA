package Functions;

/**
 * Advanced mathematical functions: Factorials, Combinations (nCr), and Geometric formulas.
 */
public class MathFunctions {

    // Factorial of a number n (n!)
    public static long factorial(int n) {
        if (n < 0) return -1; // Invalid for negative numbers
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Binomial Coefficient nCr = n! / (r! * (n-r)!)
    public static long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        long factN = factorial(n);
        long factR = factorial(r);
        long factNmr = factorial(n - r);

        return factN / (factR * factNmr);
    }

    // Check Pythagorean Triplet (a^2 + b^2 = c^2)
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        int x = a * a;
        int y = b * b;
        int z = c * c;
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    // Calculate circle details: returns double array [area, circumference]
    public static void printCircleMetrics(double radius) {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circle (r=%.2f) -> Area: %.2f | Circumference: %.2f\n", radius, area, circumference);
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Factorial ===");
        System.out.println("5! = " + factorial(5));

        System.out.println("\n=== 2. Binomial Coefficient (nCr) ===");
        System.out.println("5C2 = " + nCr(5, 2));

        System.out.println("\n=== 3. Pythagorean Triplet Check ===");
        System.out.println("(3, 4, 5) is Triplet? " + isPythagoreanTriplet(3, 4, 5));
        System.out.println("(5, 6, 7) is Triplet? " + isPythagoreanTriplet(5, 6, 7));

        System.out.println("\n=== 4. Circle Metrics ===");
        printCircleMetrics(7);
    }
}
