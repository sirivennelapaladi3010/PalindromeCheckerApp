class PalindromeChecker {

    public boolean checkPalindrome(String word) {

        char[] characters = word.toCharArray();
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (characters[start] != characters[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String word = "radar";

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
    }


}
