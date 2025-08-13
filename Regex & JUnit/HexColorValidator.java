import java.util.Scanner;

public class HexColorValidator {

    public static boolean isValidHexColor(String color) {
        // Regex: '#' followed by exactly 6 hex digits (case-insensitive)
        String pattern = "^#[0-9A-Fa-f]{6}$";
        return color.matches(pattern);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hex color code: ");
        String input = scanner.nextLine();

        if (isValidHexColor(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}
