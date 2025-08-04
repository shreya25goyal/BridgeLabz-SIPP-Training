import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convert:\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double c = scanner.nextDouble();
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = scanner.nextDouble();
            System.out.println("Celsius: " + fahrenheitToCelsius(f));
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
