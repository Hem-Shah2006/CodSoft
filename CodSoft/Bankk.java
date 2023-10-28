import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } 
        else 
        {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }
}
class ATM {
    private BankAccount account;
    public ATM(BankAccount account) 
    {
        this.account = account;
    }
    public void displayMenu() 
    {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) 
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
public class Bankk {
    public static void main(String args[]) {
        BankAccount userAccount = new BankAccount(0.0); // Initialize with a balance of 1000.0
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}