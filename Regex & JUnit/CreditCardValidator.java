import java.util.Scanner;

public class CreditCardValidator {

    public static boolean isValidCreditCard(String cardNumber) {
        // Check if exactly 16 digits
        if (!cardNumber.matches("\\d{16}")) {
            return false;
        }

        // Visa: starts with 4
        if (cardNumber.startsWith("4")) {
            return true;
        }

        // MasterCard: starts with 5
        if (cardNumber.startsWith("5")) {
            return true;
        }

        // Otherwise invalid
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String input = scanner.nextLine();

        if (isValidCreditCard(input)) {
            System.out.println("Valid credit card number");
        } else {
            System.out.println("Invalid credit card number");
        }

        scanner.close();
    }
}
