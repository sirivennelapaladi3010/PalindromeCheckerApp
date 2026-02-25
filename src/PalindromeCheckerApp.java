
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "Madam In Eden";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalized, 0, normalized.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println(input + " is not a Palindrome (ignoring case and spaces).");
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
