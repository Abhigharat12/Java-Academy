public class BankAc {
    String Holder;
    long AcNo;
    int Balance;

    // Constructor
    BankAc(String Holder, long AcNo, int Balance) {
        this.Holder = Holder;
        this.AcNo = AcNo;
        this.Balance = Balance;
    }

    // Deposit method
    public void Deposit(int Deposit) {
        Balance += Deposit;  // update balance
        System.out.println("Account Holder: " + Holder);
        System.out.println("Account Number: " + AcNo);
        System.out.println("Account Balance after deposit: " + Balance);
        System.out.println("----------------------------------");
    }
    public void Withdraw(int Withdrawl) {
        Balance -= Withdrawl;  // update balance
        System.out.println("Account Holder: " + Holder);
        System.out.println("Account Number: " + AcNo);
        System.out.println("Account Balance after Withdrawal: " + Balance);
        System.out.println("----------------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        BankAc account = new BankAc("John Doe", 123456789, 1000);
        account.Deposit(500);  // Example deposit
        account.Withdraw(300);
    }
}
