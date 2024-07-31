public abstract class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount) ;

    public abstract void withdraw(double amount) ;

    // Abstract method for displaying account information
    public void displayAccountInfo() {}

}
