import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

// Interface for palindrome checking strategy
interface PalindromeAlgorithm {
    boolean check(String text);
}

// Algorithm 1: Iterative using string reversal
class IterativePalindrome implements PalindromeAlgorithm {
    public boolean check(String text) {
        if (text == null) return false;
        String processed = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(processed).reverse().toString();
        return processed.equals(reversed);
    }
}

// Algorithm 2: Recursive
class RecursivePalindrome implements PalindromeAlgorithm {
    public boolean check(String text) {
        if (text == null) return false;
        String processed = text.replaceAll("\\s+", "").toLowerCase();
        return isPalindrome(processed, 0, processed.length() - 1);
    }

    private boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}

// Algorithm 3: Using Deque (two-pointer approach)
class DequePalindrome implements PalindromeAlgorithm {
    public boolean check(String text) {
        if (text == null) return false;
        String processed = text.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : processed.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// Main class
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Choose Palindrome Algorithm:");
        System.out.println("1 - Iterative (reverse string)");
        System.out.println("2 - Recursive");
        System.out.println("3 - Deque / Two-pointer");

        int choice = sc.nextInt();

        PalindromeAlgorithm algorithm;

        switch (choice) {
            case 1:
                algorithm = new IterativePalindrome();
                break;
            case 2:
                algorithm = new RecursivePalindrome();
                break;
            case 3:
                algorithm = new DequePalindrome();
                break;
            default:
                System.out.println("Invalid choice. Using Iterative by default.");
                algorithm = new IterativePalindrome();
        }

        if (algorithm.check(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}