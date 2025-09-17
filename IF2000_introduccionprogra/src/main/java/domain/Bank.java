package domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() { return name; }

    public void addAccount(Account account) { accounts.add(account); }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) return acc;
        }
        return null;
    }

    public List<Account> getAccounts() { return accounts; }
}

