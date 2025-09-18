package com.mycompany.lab_03;



public class CheckingAccount extends Account {

    private double interest;

    public CheckingAccount(double interest) {
        this.interest = interest;
    }

    public CheckingAccount(double interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.interest = interest;
    }

    public double getInterest() { return interest; }
    public void setInterest(double interest) { this.interest = interest; }

    @Override
    public void deposit(double amount, Binnacle binnacle) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            binnacle.addLog("Deposit", this);
        }
    }

    @Override
    public void withdraw(double amount, Binnacle binnacle) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            binnacle.addLog("Withdraw", this);
        } else {
            System.out.println("You don't have enough money");
        }
    }

    @Override
    public double interestCalculation() {
        double gainedInterest = (getBalance() * (interest / 100.0)) / 12.0;
        setBalance(getBalance() + gainedInterest);
        return getBalance();
    }

    @Override
    public String toString() {
        double gainedInterest = (getBalance() * (interest / 100.0)) / 12.0;
        return super.toString() +
                "\nAccount Type: CHECKING ACCOUNT" +
                "\nInterest rate: " + interest + "%" +
                "\nInterest (calculated): " + String.format("%.2f", gainedInterest) +
                "\nBalance after interest: " + String.format("%.2f", getBalance());
    }
}

