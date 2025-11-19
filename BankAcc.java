public class BankAcc {
    // Private variable
    private double balance;

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAcc account = new BankAcc();

        // Set initial balance
        account.setBalance(1000);

        // Perform transactions
        account.deposit(500);
        account.withdraw(200);

        // Display final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
