import java.util.Scanner;

public class LicensePlateValidator {

    public static boolean isValidLicensePlate(String plate) {
        // Regex: two uppercase letters followed by four digits
        String pattern = "^[A-Z]{2}\\d{4}$";
        return plate.matches(pattern);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter license plate: ");
        String input = scanner.nextLine();

        if (isValidLicensePlate(input)) {
            System.out.println("Valid license plate");
        } else {
            System.out.println("Invalid license plate");
        }

        scanner.close();
    }
}
