import java.util.Scanner;

// Class that encapsulates palindrome logic
class PalindromeChecker{
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Check palindrome (ignores spaces and case)
    public boolean isPalindrome() {
        if (text == null) return false;

        // Remove spaces and convert to lowercase
        String processed = text.replaceAll("\\s+", "").toLowerCase();

        // Reverse the processed string
        String reversed = new StringBuilder(processed).reverse().toString();

        // Compare original and reversed
        return processed.equals(reversed);
    }
}

// Main class
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);

        if (checker.isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}