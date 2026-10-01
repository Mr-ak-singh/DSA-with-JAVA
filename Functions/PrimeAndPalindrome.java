package Functions;

/**
 * Prime, Palindrome, and Armstrong number verification functions.
 */
public class PrimeAndPalindrome {

    // Check if a number is prime (optimized up to sqrt(N))
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Print all prime numbers between range [start, end]
    public static void printPrimesInRange(int start, int end) {
        System.out.print("Prime numbers between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Check if an integer is a Palindrome (e.g. 121, 1221)
    public static boolean isNumberPalindrome(int n) {
        if (n < 0) return false;
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    // Check if a String is a Palindrome (e.g. "racecar", "madam")
    public static boolean isStringPalindrome(String str) {
        if (str == null) return false;
        String cleanStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0, j = cleanStr.length() - 1;
        while (i < j) {
            if (cleanStr.charAt(i) != cleanStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Check if 3-digit number is an Armstrong number (sum of cubes of digits = original number)
    public static boolean isArmstrongNumber(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += (digit * digit * digit);
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Prime Number Check ===");
        System.out.println("Is 29 Prime? " + isPrime(29));
        System.out.println("Is 15 Prime? " + isPrime(15));

        System.out.println("\n=== 2. Primes in Range ===");
        printPrimesInRange(1, 30);

        System.out.println("\n=== 3. Number Palindrome ===");
        System.out.println("Is 121 Palindrome? " + isNumberPalindrome(121));
        System.out.println("Is 123 Palindrome? " + isNumberPalindrome(123));

        System.out.println("\n=== 4. String Palindrome ===");
        System.out.println("Is 'A man, a plan, a canal: Panama' Palindrome? " + isStringPalindrome("A man, a plan, a canal: Panama"));

        System.out.println("\n=== 5. Armstrong Number Check ===");
        System.out.println("Is 153 Armstrong? " + isArmstrongNumber(153));
        System.out.println("Is 370 Armstrong? " + isArmstrongNumber(370));
        System.out.println("Is 123 Armstrong? " + isArmstrongNumber(123));
    }
}
