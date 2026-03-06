import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        System.out.println("Deque elements: " + deque);

        // Access front and rear elements
        int front = deque.peekFirst();
        int rear = deque.peekLast();

        System.out.println("Front element: " + front);
        System.out.println("Rear element: " + rear);

        // Compare front and rear
        if(front == rear) {
            System.out.println("Front and Rear elements are equal.");
        } else {
            System.out.println("Front and Rear elements are not equal.");
        }
    }
}