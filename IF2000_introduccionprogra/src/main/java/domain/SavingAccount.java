
package domain;

public class SavingAccount extends Account {

    private String initialDate;
    private int months;
    private double interest; // annual percentage

    public SavingAccount(String initialDate, int months, double interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingAccount(String initialDate, int months, double interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public String getInitialDate() { return initialDate; }
    public void setInitialDate(String initialDate) { this.initialDate = initialDate; }
    public int getMonths() { return months; }
    public void setMonths(int months) { this.months = months; }
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
        double gainedInterest = getBalance() * (interest / 100.0) * (months / 12.0);
        setBalance(getBalance() + gainedInterest);
        return getBalance();
    }

    @Override
    public String toString() {
        double gainedInterest = getBalance() * (interest / 100.0) * (months / 12.0);
        return super.toString() +
                "\nAccount Type: SAVING ACCOUNT" +
                "\nInitial date: " + initialDate +
                "\nMonths: " + months +
                "\nInterest rate: " + interest + "%" +
                "\nInterest (calculated): " + String.format("%.2f", gainedInterest) +
                "\nBalance after interest: " + String.format("%.2f", getBalance());
    }
}


