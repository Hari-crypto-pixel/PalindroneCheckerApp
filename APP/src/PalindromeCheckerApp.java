import java.util.Scanner;

// Palindrome logic class (package-private, not public)
class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome (ignores spaces and case)
    public boolean isPalindrome() {
        if (text == null) return false;

        // Remove spaces and convert to lowercase
        String processed = text.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(processed).reverse().toString();

        // Compare original and reversed
        return processed.equals(reversed);
    }
}

// Main class (must be public; filename should be PalindromeCheckerApp.java)
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(input);

        // Check palindrome
        if (checker.isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}