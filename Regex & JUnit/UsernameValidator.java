import java.util.Scanner;

public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        // Check length
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }

        // Check first character is a letter
        if (!Character.isLetter(username.charAt(0))) {
            return false;
        }

        // Check all characters are letters, digits, or underscore
        for (char ch : username.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }

        return true; // Passed all checks
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String input = scanner.nextLine();

        if (isValidUsername(input)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }

        scanner.close();
    }
}
