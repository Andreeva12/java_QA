package HomeWork4_2;

import java.util.Scanner;

public class BankAccount {
    private static int accountNumberCounter = 1000;
    private final int accountNumber;
    private double balance;
    private final BankService bankService;

    public BankAccount() {
        this.accountNumber = accountNumberCounter++;
        this.balance = 0;
        this.bankService = new BankService();
    }

    public void deposit(double amount) {
        this.bankService.deposit(amount);
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.bankService.withdraw(amount);
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        boolean banking = true;
        while (banking) {
            System.out.println("Welcome to the bank! Please select what you'd like to do:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View balance");
            System.out.println("4. Exit");

            int userChoice = userInputScanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = userInputScanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount = userInputScanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Account balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for visiting the bank.");
                    banking = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
