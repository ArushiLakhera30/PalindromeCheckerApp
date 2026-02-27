import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String text = "radar";

        // Clean the string: remove spaces and make lowercase
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        // Create a stack and a queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push and enqueue all characters
        for (char c : cleaned.toCharArray()) {
            stack.push(c);   // LIFO
            queue.add(c);    // FIFO
        }

        boolean isPalindrome = true;

        // Compare characters popped from stack and dequeued from queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome!");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
