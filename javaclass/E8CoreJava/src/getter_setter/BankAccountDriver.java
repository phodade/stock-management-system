package getter_setter;

public class BankAccountDriver {
    public static void main(String[] args) {
        // Create bank account objects
        BankAccount acc1 = new BankAccount("Jai", 5000, 1234);
        BankAccount acc2 = new BankAccount("Pratiksha", 10000, 4321);

        // Test operations
        System.out.println("=== Checking Balances ===");
        acc1.checkBalance(1234);
        acc2.checkBalance(4321);

        System.out.println("\n=== Depositing Money ===");
        acc1.deposit(1500);
        acc2.deposit(2000);

        System.out.println("\n=== Withdrawing Money ===");
        acc1.withdraw(2000, 1234);
        acc2.withdraw(15000, 4321); // should fail due to insufficient funds

        System.out.println("\n=== Checking Balances Again ===");
        acc1.checkBalance(1234);
        acc2.checkBalance(4321);

        System.out.println("\n=== Wrong PIN Check ===");
        acc1.checkBalance(1111);
        acc2.withdraw(1000, 9999);
    }
}
