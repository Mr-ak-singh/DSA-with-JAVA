package Problem_Solving;

import java.util.Arrays;

/**
 * String problem solving algorithms.
 */
public class StringProblems {

    /**
     * Check if two strings s and t are valid anagrams.
     * Time Complexity: O(N log N) due to sorting.
     */
    public static boolean isAnagram(String s, String t) {
        String sClean = s.replaceAll("\\s", "").toLowerCase();
        String tClean = t.replaceAll("\\s", "").toLowerCase();

        if (sClean.length() != tClean.length()) {
            return false;
        }

        char[] c1 = sClean.toCharArray();
        char[] c2 = tClean.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    /**
     * Two-pointer check for Valid Palindrome ignoring non-alphanumeric characters.
     * Time Complexity: O(N)
     */
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String clean = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Valid Anagram ===");
        System.out.println("isAnagram('aman', 'nama'): " + isAnagram("aman", "nama"));
        System.out.println("isAnagram('hello', 'world'): " + isAnagram("hello", "world"));

        System.out.println("\n=== 2. Valid Palindrome (Two Pointer) ===");
        System.out.println("isPalindrome('A man, a plan, a canal: Panama'): " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("isPalindrome('race a car'): " + isPalindrome("race a car"));
    }
}
