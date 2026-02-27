import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String text = "racecar";

        // Clean the string: remove spaces and make lowercase
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        // Convert to character array
        char[] chars = cleaned.toCharArray();

        boolean isPalindrome = true;
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
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
