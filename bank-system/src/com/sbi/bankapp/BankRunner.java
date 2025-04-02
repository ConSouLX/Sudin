package com.sbi.bankapp;
import com.sbi.bankapp.account.BankAccounts;
import com.sbi.bankapp.bank.Banker;
import com.sbi.bankapp.customers.Customer;


    public class BankRunner {
        public static void main(String[] args) {
            String locationOfBank = "New York";
            String branchesOfBank[] = {"Manhattan", "Brooklyn", "Queens"};

            BankAccounts accounts1[] = new BankAccounts[2];
            BankAccounts account1 = new BankAccounts();
            account1.accountId = 101;
            account1.accountType = "Savings";
            account1.balance = 5000.00;

            BankAccounts account2 = new BankAccounts();
            account2.accountId = 102;
            account2.accountType = "Checking";
            account2.balance = 3000.00;

            accounts1[0] = account1;
            accounts1[1] = account2;

            Customer customers[] = new Customer[1];
            Customer customer1 = new Customer();
            customer1.customerId = 1;
            customer1.customerName = "John Doe";
            customer1.accounts = accounts1;

            customers[0] = customer1;

            Banker ref = new Banker();
            ref.bankId = 1;
            ref.location = locationOfBank;
            ref.branches = branchesOfBank;
            ref.customers = customers;

            System.out.println("Bank ID: " + ref.bankId);
            System.out.println("Location: " + ref.location);
            System.out.println("Branch: " + ref.branches[0]);
            System.out.println("Customer: " + ref.customers[0].customerName);
            System.out.println("Account Type: " + ref.customers[0].accounts[0].accountType);
            System.out.println("Balance: $" + ref.customers[0].accounts[0].balance);
        }
    }


