import java.util.Scanner;

class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    // Withdraw Method
    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Funds!");
        } else if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully!");
        }
    }

    // Check Balance Method
    void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }
}

public class BankingApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating Bank Account
        BankAccount account =
                new BankAccount("Naveen", 1001, 5000);

        int choice;

        do {

            System.out.println("\n===== Banking System =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Deposit Amount : ");
                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);
                    break;

                case 2:

                    System.out.print("Enter Withdrawal Amount : ");
                    double withdrawAmount = sc.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;

                case 3:

                    account.checkBalance();
                    break;

                case 4:

                    System.out.println("Thank You for Using Banking System!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}