package tangavietanh_3289.Lec11_Encapsulation.Exersise11_Lec15_14_9;

import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount() {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String owner, int balance) {

        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void enterInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        setAccountNumber(sc.nextLine());
        
        System.out.println("Enter Owner: ");
        setOwner(sc.nextLine());
        
        System.out.println("Enter Balance: ");
        setBalance(sc.nextInt());
    }

    public void displayInfo() {
        System.out.println("Account Number: " + getAccountNumber() +
                "Owner: " + getOwner() +
                "Balance: " + getBalance());
    }
}
