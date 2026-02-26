public class PalindroneCheckerApp{
    public static void main(String[] args) {
        String word = "madam";
        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if(word.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}