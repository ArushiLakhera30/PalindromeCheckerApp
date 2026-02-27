import java.util.Scanner;
public class PalindromeCheckerApp {
    public class PalindromeUsingStack {

        public static void main(String[] args) {
            // Hardcoded string to check
            String text = "level";

            // Clean the string: remove spaces and make lowercase
            String cleaned = text.replaceAll("\\s+", "").toLowerCase();

            // Create a stack and push all characters
            Stack<Character> stack = new Stack<>();
            for (char c : cleaned.toCharArray()) {
                stack.push(c);
            }

            // Build reversed string by popping from stack
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }

            // Compare original and reversed
            if (cleaned.equals(reversed.toString())) {
                System.out.println("\"" + text + "\" is a palindrome!");
            } else {
                System.out.println("\"" + text + "\" is not a palindrome.");
            }
        }

    }
