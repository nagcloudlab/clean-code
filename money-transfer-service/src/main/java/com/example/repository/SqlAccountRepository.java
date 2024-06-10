package com.example.repository;

import com.example.model.Account;
import org.apache.log4j.Logger;

public class SqlAccountRepository implements AccountRepository{

    private static Logger logger = Logger.getLogger("money-transfer-service");

    public SqlAccountRepository() {
        logger.info("SqlAccountRepository instance created");
    }

    public Account loadAccount(String accountNumber) {
        // Load account from database
        logger.info("Loading account from database for account number: " + accountNumber);
        return new Account(accountNumber, "John Doe", 1000);
    }

    public void updateAccount(Account account) {
        // Update account in database
        logger.info("Updating account in database for account number: " + account.getAccountNumber());
    }

}
