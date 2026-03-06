class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class  PalindromeCheckerApp {

    Node head;

    // Add node at end
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Check palindrome
    boolean isPalindrome() {
        String str = "";
        Node temp = head;

        // Convert list to string
        while (temp != null) {
            str += temp.data;
            temp = temp.next;
        }

        // Reverse string
        String rev = new StringBuilder(str).reverse().toString();

        return str.equals(rev);
    }

    public static void main(String[] args) {
        PalindromeCheckerApp list = new PalindromeCheckerApp();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        if (list.isPalindrome())
            System.out.println("Linked List is Palindrome");
        else
            System.out.println("Linked List is Not Palindrome");
    }
}