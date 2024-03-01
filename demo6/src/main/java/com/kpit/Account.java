package com.kpit;

public class Account {
    private int  accountNumber;
    private String accountHolder;
    private double accountBalance;
    
    public Account() {
        System.out.println("Account constuctor");
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        System.out.println("setAccountNumber(int)");
        this.accountNumber = accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        System.out.println("setAccountHolder(String)");
        this.accountHolder = accountHolder;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        System.out.println("setAccountbalance(String)");
        this.accountBalance = accountBalance;
    }
    
}
