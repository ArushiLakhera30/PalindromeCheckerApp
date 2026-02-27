import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String text = "rotor";

        // Clean the string: remove spaces and make lowercase
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        // Load characters into a Deque
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : cleaned.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
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
