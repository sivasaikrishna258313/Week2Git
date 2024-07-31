public class Main {
    public static void main(String[] args) {

        int savingsAccountNumber=34698;
        int currentAccountNumber=23948;

        String savingsAccountHolderName="siva";
        String currentAccountHolderName="sai";

        double savingsAccountBalance=100.5;
        double currentAccountBalance=346.7;

        String savingsAccountInterestRate="10%";
        String currentAccountInterest="0%";

        double savingsAccountMinimumBalance=1000.0;
        double currentAccountMinimumBalance=5000.0;



        SavingsAccount savingsAccount=new SavingsAccount(savingsAccountNumber,savingsAccountHolderName,savingsAccountBalance,savingsAccountInterestRate,savingsAccountMinimumBalance);
        CurrentAccount currentAccount=new CurrentAccount(currentAccountNumber,currentAccountHolderName,currentAccountBalance,currentAccountInterest,currentAccountMinimumBalance);

        savingsAccount.displayAccountInfo();

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);

        currentAccount.displayAccountInfo();

        currentAccount.deposit(200);
        currentAccount.withdraw(150);
    }
}