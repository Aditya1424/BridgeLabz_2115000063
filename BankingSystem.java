import java.util.*;
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; 
    private static final double LOAN_MULTIPLIER = 5;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved.");
            return true;
        }
        System.out.println("Loan request denied.");
        return false;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_MULTIPLIER;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("1234", "Aditya", 5000));
        accounts.add(new CurrentAccount("5678", "Dhruv", 10000));

        for (BankAccount account : accounts) {
            account.displayDetails();
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanAccount.calculateLoanEligibility());
                loanAccount.applyForLoan(20000);
            }
        }
    }
}
