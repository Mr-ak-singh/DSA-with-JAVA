package Arrays;

import java.util.Arrays;

/**
 * Basic 1D array operations: traversal, searching, finding min/max, second max, etc.
 */
public class ArrayBasics {

    // Print all elements of an array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Q1: Marks filter - Print roll numbers (indices) where marks < 35
    public static void printFailingRollNumbers(int[] marks) {
        System.out.print("Roll numbers with marks < 35: ");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Q2: Calculate sum of elements in an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    // Q3: Linear Search - Find index of target element X
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

    // Q4: Find maximum value in array
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    // Q5: Find second maximum value in array
    public static int findSecondMax(int[] arr) {
        int max = findMax(arr);
        int secondMax = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > secondMax && val != max) {
                secondMax = val;
            }
        }
        return secondMax;
    }

    // Q6: Count elements greater than given number X
    public static int countGreaterThanX(int[] arr, int x) {
        int count = 0;
        for (int val : arr) {
            if (val > x) {
                count++;
            }
        }
        return count;
    }

    // Pair sum of two equal-sized arrays: arrA[i] + arrB[i]
    public static int[] pairSumArrays(int[] arrA, int[] arrB) {
        int[] result = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            result[i] = arrA[i] + arrB[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sample = {5, 4, 6, 3, 10, 23, 56};

        System.out.println("=== 1. Array Traversal ===");
        printArray(sample);

        System.out.println("\n=== 2. Marks Filter (< 35) ===");
        int[] studentMarks = {45, 22, 89, 31, 75, 12};
        printFailingRollNumbers(studentMarks);

        System.out.println("\n=== 3. Sum of Array Elements ===");
        System.out.println("Sum = " + calculateSum(sample));

        System.out.println("\n=== 4. Linear Search ===");
        int target = 23;
        int index = linearSearch(sample, target);
        System.out.println("Element " + target + " found at index: " + index);

        System.out.println("\n=== 5. Max and Second Max ===");
        System.out.println("Max: " + findMax(sample));
        System.out.println("Second Max: " + findSecondMax(sample));

        System.out.println("\n=== 6. Count Elements > X ===");
        System.out.println("Elements > 10 count: " + countGreaterThanX(sample, 10));

        System.out.println("\n=== 7. Pairwise Sum of Two Arrays ===");
        int[] arrA = {1, 2, 3, 4, 5};
        int[] arrB = {6, 7, 8, 9, 10};
        System.out.println("Pairwise Sum: " + Arrays.toString(pairSumArrays(arrA, arrB)));
    }
}
