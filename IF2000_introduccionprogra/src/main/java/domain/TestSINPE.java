package com.mycompany.if2000_introduccionprogra;

import domain.*;

public class TestSINPE {

    // Creamos un método estático "run" para que pueda ser llamado desde main
    public static void run() {

        // Create Binnacle
        Binnacle binnacle = new Binnacle();

        // Create clients
        Client client1 = new Client("1-2323-4545", "Edgardo Corrales", "45456789", "San Jose");
        Client client2 = new Client("1-3434-5656", "Maria Lopez", "87654321", "Alajuela");

        // Create banks
        Bank bank1 = new Bank("Banco Central");
        Bank bank2 = new Bank("Banco Nacional");

        // Create accounts
        SavingAccount sa1 = new SavingAccount("2025-09-04", 12, 5, "1000567801", 25000, client1);
        CheckingAccount ca1 = new CheckingAccount(2, "2000567801", 10000, client2);

        // Add accounts to banks
        bank1.addAccount(sa1);
        bank2.addAccount(ca1);

        // Deposits and Withdrawals
        sa1.deposit(3000, binnacle);
        ca1.withdraw(2000, binnacle);

        // Apply interest
        sa1.interestCalculation();
        ca1.interestCalculation();

        // Print account info
        System.out.println(sa1);
        System.out.println(ca1);

        // SINPE Transfer
        SINPE sinpe = new SINPE(binnacle);
        sinpe.transfer(bank1, bank2, "1000567801", "2000567801", 5000);

        // Print Binnacle logs
        System.out.println("\nBinnacle Logs:");
        for (Binnacle.LogEntry log : binnacle.getLogs()) {
            System.out.println(log);
            System.out.println("--------------------------------");
        }
    }
}
