public class SavingsAccount extends BankAccount{
   private String InterestRate;
    private double minimumBalance;
    public SavingsAccount(int accountNumber, String accountHolderName, double balance,String earnsInterest,double minimumBalance) {
        super(accountNumber, accountHolderName, balance);
        this.InterestRate =earnsInterest;
        this.minimumBalance=minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public String getInterestRate() {
        return InterestRate;
    }

    // Override deposit method
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account Balance after deposit :"+balance);
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Account Balance after withdraw :"+balance+"\n");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Override displayAccountInfo method
    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Information:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + balance);
        System.out.println("Savings Account Minimum Balance: " + getMinimumBalance());
        System.out.println("Savings Account Interest Rate: " + getInterestRate()+"\n");

    }
}
