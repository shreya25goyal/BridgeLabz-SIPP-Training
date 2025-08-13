import java.util.Scanner;

public class IPAddressValidator {

    public static boolean isValidIPv4(String ip) {
        // Split the IP by dots
        String[] parts = ip.split("\\.");

        // IPv4 must have exactly 4 parts
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            try {
                // Check if part is a number
                int num = Integer.parseInt(part);

                // Check if in valid range 0-255
                if (num < 0 || num > 255) {
                    return false;
                }

                // Leading zeros are not allowed (e.g., 01, 001)
                if (part.length() > 1 && part.startsWith("0")) {
                    return false;
                }

            } catch (NumberFormatException e) {
                // Not a number
                return false;
            }
        }
        return true; // All checks passed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IPv4 address: ");
        String input = scanner.nextLine();

        if (isValidIPv4(input)) {
            System.out.println("Valid IPv4 address");
        } else {
            System.out.println("Invalid IPv4 address");
        }

        scanner.close();
    }
}
