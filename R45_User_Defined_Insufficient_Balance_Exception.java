class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("Initial Balance: " + initialBalance);
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Withdrawal amount exceeds current balance.");
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}
public class R45_User_Defined_Insufficient_Balance_Exception {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(300.0);
        try {
            System.out.println("Attempting to withdraw 500.0");
            account.withdraw(500.0);
        }
        catch (InsufficientBalanceException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
