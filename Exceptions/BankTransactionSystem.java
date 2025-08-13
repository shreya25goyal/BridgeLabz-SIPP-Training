// Step 1: Custom checked exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Step 2: BankAccount class with withdraw method
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // withdraw method that throws exceptions
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

// Step 3: Main class to test the system
public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);  // Initial balance

        try {
            // Try different values here to test behavior
            account.withdraw(1000);   // Valid withdrawal
            // account.withdraw(6000);   // Uncomment to test insufficient balance
            // account.withdraw(-100);   // Uncomment to test negative amount

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
