package getter_setter;

public class BankAccount {
    private String name;
    private double balance;
    private int pin;

    // Constructor
    public BankAccount(String name, double balance, int pin) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    // Method to check balance
    public void checkBalance(int pin) {
        if (this.pin == pin)
            System.out.println("Balance: " + balance);
        else
            System.err.println("PIN is incorrect! Check the PIN and try again.");
    }

    // Method to withdraw money
    public void withdraw(double withdrawalAmt, int pin) {
        if (this.pin == pin) {
            if (withdrawalAmt > 0 && withdrawalAmt <= this.balance) {
                balance -= withdrawalAmt;
                System.out.println("Withdrawal successful! Amount withdrawn: " + withdrawalAmt);
            } else {
                System.err.println("Invalid amount or insufficient balance!");
                System.err.println("Withdrawal unsuccessful.");
            }
        } else {
            System.err.println("PIN is incorrect! Check the PIN and try again.");
            System.err.println("Withdrawal unsuccessful.");
        }
    }

    // Method to deposit money
    public void deposit(double depositAmt) {
        if (depositAmt > 0) {
            balance += depositAmt;
            System.out.println("Deposit successful! Amount deposited: " + depositAmt);
        } else {
            System.err.println("Please enter a valid amount.");
            System.err.println("Deposit unsuccessful.");
        }
    }

    // Getter for name (optional)
    public String getName() {
        return name;
    }
}
