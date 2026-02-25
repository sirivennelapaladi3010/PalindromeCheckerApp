
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String word = "radar";

        boolean isPalindrome = checkPalindrome(word, 0, word.length() - 1);

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
    }

    public static boolean checkPalindrome(String word, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        return checkPalindrome(word, start + 1, end - 1);
    }
}
