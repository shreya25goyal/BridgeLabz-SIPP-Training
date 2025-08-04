import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    static Random random = new Random();

    public static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100, and I'll guess it.");

        while (!correct && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            String feedback = scanner.nextLine();

            switch (feedback.toLowerCase()) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number.");
                    correct = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!correct) {
            System.out.println("Something went wrong. Are you sure you played fair?");
        }

        scanner.close();
    }
}
