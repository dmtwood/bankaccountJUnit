package com.dimidev.junit.bankaccount;

public class Bankaccount {
    private int accountnumber;
    private double balance;

    public Bankaccount(int nr, double startAmount) {
        accountnumber = nr;
        balance = startAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawl(double amount) {
        balance -= amount;
    }
}
