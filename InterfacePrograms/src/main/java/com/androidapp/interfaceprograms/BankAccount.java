package com.androidapp.interfaceprograms;

public class BankAccount {
    private double balance; // obj.getBalance()
    private int accountNumber; // obj.getAccountNumber()
    private static int lastAssignedNumber=1000; // BankAccount.lastAssignedNumber

    public BankAccount(double balance) {
        this.balance = balance;
        lastAssignedNumber++;
        accountNumber=lastAssignedNumber;
    }

    public double getBalance() {
        return balance;
    }
}
