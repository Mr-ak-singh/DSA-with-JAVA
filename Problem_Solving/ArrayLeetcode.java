package Problem_Solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Curated array algorithms & LeetCode solutions.
 */
public class ArrayLeetcode {

    // LeetCode 1920: Build Array from Permutation
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // LeetCode 1929: Concatenation of Array
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    // LeetCode 1480: Running Sum of 1D Array
    public static int[] runningSum(int[] nums) {
        int[] running = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            running[i] = sum;
        }
        return running;
    }

    // LeetCode 1672: Richest Customer Wealth
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int bank : customer) {
                currentWealth += bank;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }

    // LeetCode 1470: Shuffle the Array [x1,x2,...,xn, y1,y2,...,yn] -> [x1,y1,x2,y2,...,xn,yn]
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }

    // LeetCode 1295: Find Numbers with Even Number of Digits
    public static int findNumbersWithEvenDigits(int[] nums) {
        int evenDigitCount = 0;
        for (int num : nums) {
            int digits = 0;
            int temp = num;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            if (digits % 2 == 0) {
                evenDigitCount++;
            }
        }
        return evenDigitCount;
    }

    // LeetCode 1431: Kids With the Greatest Number of Candies
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }

    // LeetCode 1512: Number of Good Pairs (nums[i] == nums[j] and i < j)
    public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }

    // LeetCode 832: Flipping an Image (Horizontal Flip + Bitwise Invert)
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            int m = image[i].length;
            for (int j = 0; j < m; j++) {
                result[i][j] = image[i][m - 1 - j] ^ 1; // Reverse column and XOR with 1
            }
        }
        return result;
    }

    // Array Insertion: Insert value into array at position pos (1-indexed)
    public static void insertElement(char[] arr, int pos, char val) {
        for (int i = arr.length - 1; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = val;
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Build Array from Permutation ===");
        int[] permNums = {0, 2, 1, 5, 3, 4};
        System.out.println("Input: " + Arrays.toString(permNums));
        System.out.println("Output: " + Arrays.toString(buildArray(permNums)));

        System.out.println("\n=== 2. Concatenation of Array ===");
        int[] concNums = {1, 2, 1};
        System.out.println("Output: " + Arrays.toString(getConcatenation(concNums)));

        System.out.println("\n=== 3. Running Sum of 1D Array ===");
        int[] runNums = {1, 2, 3, 4};
        System.out.println("Output: " + Arrays.toString(runningSum(runNums)));

        System.out.println("\n=== 4. Richest Customer Wealth ===");
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println("Max Wealth: " + maximumWealth(accounts));

        System.out.println("\n=== 5. Shuffle Array ===");
        int[] shufNums = {2, 5, 1, 3, 4, 7};
        System.out.println("Shuffled: " + Arrays.toString(shuffle(shufNums, 3)));

        System.out.println("\n=== 6. Numbers with Even Digits ===");
        int[] evenNums = {12, 345, 2, 6, 7896};
        System.out.println("Count: " + findNumbersWithEvenDigits(evenNums));

        System.out.println("\n=== 7. Kids With Candies ===");
        int[] candies = {2, 3, 5, 1, 3};
        System.out.println("Result: " + kidsWithCandies(candies, 3));

        System.out.println("\n=== 8. Number of Good Pairs ===");
        int[] pairs = {1, 2, 3, 1, 1, 3};
        System.out.println("Good Pairs Count: " + numIdenticalPairs(pairs));

        System.out.println("\n=== 9. Flip and Invert Image ===");
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] flipped = flipAndInvertImage(image);
        for (int[] row : flipped) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\n=== 10. Array Element Insertion ===");
        char[] charArr = new char[6];
        charArr[0] = 'a'; charArr[1] = 'b'; charArr[2] = 'c'; charArr[3] = 'd'; charArr[4] = 'e';
        System.out.println("Before Insertion: " + Arrays.toString(charArr));
        insertElement(charArr, 3, 'X');
        System.out.println("After Inserting 'X' at position 3: " + Arrays.toString(charArr));
    }
}
