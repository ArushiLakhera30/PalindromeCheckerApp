import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String text = "madam";

        // Clean the string: remove spaces and make lowercase
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome!");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

}
