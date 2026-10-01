package Conditionals_And_Loops;

/**
 * Utility functions for geometric area and perimeter calculations.
 */
public class GeometryCalculations {

    // Area of Circle = π * r^2
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Triangle = 0.5 * base * height
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of Rectangle = length * breadth
    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    // Area of Rhombus = (d1 * d2) / 2
    public static double areaOfRhombus(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2.0;
    }

    public static void main(String[] args) {
        System.out.println("=== Geometric Area Calculations ===");
        System.out.printf("Area of Circle (r=7): %.2f\n", areaOfCircle(7));
        System.out.printf("Area of Triangle (b=6, h=20): %.2f\n", areaOfTriangle(6, 20));
        System.out.printf("Area of Rectangle (l=4, b=8): %.2f\n", areaOfRectangle(4, 8));
        System.out.printf("Area of Rhombus (d1=6, d2=8): %.2f\n", areaOfRhombus(6, 8));
    }
}
