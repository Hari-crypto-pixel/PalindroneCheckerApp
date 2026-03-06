public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String str = "HELLO";

        // Convert string to character array
        char[] ch = str.toCharArray();

        System.out.println("Characters in the array:");

        // Display characters
        for(int i = 0; i < ch.length; i++) {
            System.out.println("ch[" + i + "] = " + ch[i]);
        }

        // Compare characters
        System.out.println("\nCharacter Comparisons:");

        for(int i = 0; i < ch.length - 1; i++) {
            if(ch[i] == ch[i + 1]) {
                System.out.println(ch[i] + " is equal to " + ch[i + 1]);
            } else {
                System.out.println(ch[i] + " is not equal to " + ch[i + 1]);
            }
        }
    }
}