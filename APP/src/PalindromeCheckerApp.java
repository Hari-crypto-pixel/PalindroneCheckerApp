import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Adding elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue elements: " + queue);

        // Removing elements (FIFO)
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());

        System.out.println("Queue after removals: " + queue);
    }
}