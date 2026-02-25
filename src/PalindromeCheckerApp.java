
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println(input + " is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println(input + " is not a Palindrome (ignoring case and spaces).");
        }
    }
}
