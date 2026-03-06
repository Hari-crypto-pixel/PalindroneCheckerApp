import java.util.Scanner;

public class PalindromeCheckerApp{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        // Reverse the string
        String rev = new StringBuilder(str).reverse().toString();

        // Check palindrome
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}