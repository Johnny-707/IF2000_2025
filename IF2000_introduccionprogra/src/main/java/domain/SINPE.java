package domain;

public class SINPE {

    private Binnacle binnacle;

    public SINPE(Binnacle binnacle) {
        this.binnacle = binnacle;
    }

    public void transfer(Bank fromBank, Bank toBank, String fromAccNum, String toAccNum, double amount) {
        Account from = fromBank.findAccount(fromAccNum);
        Account to = toBank.findAccount(toAccNum);

        if (from == null || to == null) {
            System.out.println("One of the accounts does not exist.");
            return;
        }

        if (from.getBalance() < amount) {
            System.out.println("Insufficient balance for transfer.");
            return;
        }

        from.withdraw(amount, binnacle);
        to.deposit(amount, binnacle);
        System.out.println("Transfer completed: " + amount + " from " + fromAccNum + " to " + toAccNum);
    }
}
