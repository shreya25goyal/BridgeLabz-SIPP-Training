public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is palindrome? " + isPalindrome);
    }
}
