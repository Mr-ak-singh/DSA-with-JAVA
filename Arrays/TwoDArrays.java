package Arrays;

import java.util.Arrays;

/**
 * Demonstrates 2D Arrays (Matrix): Declaration, Jagged Arrays, and Traversal styles.
 */
public class TwoDArrays {

    public static void main(String[] args) {
        System.out.println("=== 1. Standard 2D Grid Initialization ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("--- Traversal using Standard Nested Loops ---");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n--- Printing Rows using Arrays.toString() ---");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("\n=== 2. Jagged Array (Rows of Different Lengths) ===");
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("--- Enhanced For Loop Traversal ---");
        for (int[] row : jaggedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
