package domain;

public abstract class Account {

    private String accountNumber;
    private double balance;
    private Client client;

    public Account() {}

    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber()
    { return accountNumber; }
    public void setAccountNumber(String accountNumber) 
    { this.accountNumber = accountNumber; }

    public double getBalance()
    { return balance; }
    
    public void setBalance(double balance) 
    { this.balance = balance; }

    public Client getClient() 
    { return client; }
    
    public void setClient(Client client)
    { this.client = client; }

    public abstract void deposit(double amount, Binnacle binnacle);
    public abstract void withdraw(double amount, Binnacle binnacle);
    public abstract double interestCalculation();

    @Override
    public String toString() {
        return "\nBANK ACCOUNT INFORMATION:" +
                "\n--------------------------------" +
                "\nAccount Number: " + this.getAccountNumber() +
                "\nBalance: " + String.format("%.2f", this.getBalance()) +
                "\nAccount Owner:\n" + this.getClient().toString();
    }
}
