import java.util.Scanner;

class BankAccount {

    private String Name;
    private long AccountNumber;
    private String TypeOfAccount;
    private double Balance;   

    public BankAccount(String Name, long AccountNumber, String TypeOfAccount, double Balance) {
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.TypeOfAccount = TypeOfAccount;
        this.Balance = Balance;
    }
    public void deposit(double amount) {
        Balance += amount;
        System.out.println("Now the balance is: "+Balance);
    }
    public void withdraw(double amount) {
        if (amount <= Balance) {
            Balance = Balance- amount;
            System.out.println("Withdrawal balance is: " + Balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }
    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Depositor Name: " + Name);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Type: " + TypeOfAccount);
        System.out.println("Balance: " + Balance);
    }
}
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial account details:");
        System.out.print(" Name: ");
        String Name = sc.nextLine();

        System.out.print("Account Number: ");
        long AccountNumber = sc.nextLong();
        sc.nextLine();

        System.out.println("Account Type: ");
        String TypeOfAccount = sc.nextLine();

        System.out.print("Initial Balance:");
        double Balance = sc.nextDouble();

        BankAccount account = new BankAccount(Name, AccountNumber, TypeOfAccount, Balance);

        account.displayAccountInfo();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayAccountInfo();
    }
}