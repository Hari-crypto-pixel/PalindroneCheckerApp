public class PalindromeCheckerApp{

    // Approach 1: Using String reversal
    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Approach 2: Using two-pointer technique
    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Approach 3: Using recursion
    public static boolean isPalindromeRecursive(String str) {
        return isPalindromeRecursiveHelper(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeRecursiveHelper(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindromeRecursiveHelper(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String testString = "abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba"; // large palindrome

        // Run each algorithm and capture execution time
        long start, end;

        // Reverse method
        start = System.nanoTime();
        boolean result1 = isPalindromeReverse(testString);
        end = System.nanoTime();
        long timeReverse = end - start;

        // Two-pointer method
        start = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(testString);
        end = System.nanoTime();
        long timeTwoPointer = end - start;

        // Recursive method
        start = System.nanoTime();
        boolean result3 = isPalindromeRecursive(testString);
        end = System.nanoTime();
        long timeRecursive = end - start;

        // Display results
        System.out.println("Palindrome check results:");
        System.out.println("Reverse Method: " + result1 + ", Time: " + timeReverse + " ns");
        System.out.println("Two-Pointer Method: " + result2 + ", Time: " + timeTwoPointer + " ns");
        System.out.println("Recursive Method: " + result3 + ", Time: " + timeRecursive + " ns");
    }
}