package Arrays;

import java.util.Arrays;

/**
 * Advanced Array manipulations: Swapping, Two-Pointer Reversing, and Array Rotation.
 */
public class ArrayOperations {

    // Helper: Swap elements at index i and j in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse array in-place using Two-Pointer technique O(N) time, O(1) space
    public static void reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    // Reverse specific sub-segment of array from index start to end
    public static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Rotate array by K steps to the right using 3-step reverse algorithm
    // Step 1: Reverse entire array
    // Step 2: Reverse first K elements
    // Step 3: Reverse remaining N-K elements
    public static void rotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle k > n
        if (k == 0) return;

        // Step 1: Reverse whole array
        reverseSubArray(arr, 0, n - 1);
        // Step 2: Reverse first K elements
        reverseSubArray(arr, 0, k - 1);
        // Step 3: Reverse rest elements
        reverseSubArray(arr, k, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Two-Pointer In-Place Reversing ===");
        int[] arr1 = {12, 3, 4, 45, 63, 20, 30};
        System.out.println("Original: " + Arrays.toString(arr1));
        reverseInPlace(arr1);
        System.out.println("Reversed: " + Arrays.toString(arr1));

        System.out.println("\n=== 2. Rotate Array by K Steps (e.g. K = 3) ===");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before Rotation: " + Arrays.toString(arr2));
        rotateByK(arr2, 3);
        System.out.println("After Rotating by 3 steps: " + Arrays.toString(arr2));
    }
}
