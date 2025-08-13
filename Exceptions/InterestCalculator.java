public class InterestCalculator {

    // Method that declares it may throw an exception
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            // Throwing an exception manually
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        // Simple interest calculation
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        try {
            // Test with valid input
            double interest = calculateInterest(10000, 5, 2);
            System.out.println("Interest: " + interest);

            // Test with invalid input (uncomment to test exception)
            // double interest = calculateInterest(-10000, 5, 2);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
