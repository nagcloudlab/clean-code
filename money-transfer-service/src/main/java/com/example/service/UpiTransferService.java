package com.example.service;

import com.example.model.Account;
//import com.example.repository.SqlAccountRepository;
import com.example.repository.AccountRepository;
import com.example.repository.AccountRepositoryFactory;
import org.apache.log4j.Logger;


public class UpiTransferService implements TransferService {

    private static Logger logger = Logger.getLogger("money-transfer-service");
    private AccountRepository accountRepository;

    public UpiTransferService(AccountRepository accountRepository) {
        //this.accountRepository = AccountRepositoryFactory.getAccountRepository("SQL");
        this.accountRepository = accountRepository;
        logger.info("accountRepository instance injected into UpiTransferService "+accountRepository.getClass().getName());
        logger.info("UpiTransferService instance created");
    }

    @Override
    public void transfer(String sourceAccountNumber, String targetAccountNumber, double amount) {
        logger.info("Transferring " + amount + " from " + sourceAccountNumber + " to " + targetAccountNumber);
        //SqlAccountRepository accountRepository = new SqlAccountRepository();
        //AccountRepository accountRepository = AccountRepositoryFactory.getAccountRepository("SQL");
        // Load source account
        Account sourceAccount = accountRepository.loadAccount(sourceAccountNumber);
        // Load target account
        Account targetAccount = accountRepository.loadAccount(targetAccountNumber);
        // Deduct amount from source account
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        // Add amount to target account
        targetAccount.setBalance(targetAccount.getBalance() + amount);
        // Update source account
        accountRepository.updateAccount(sourceAccount);
        // Update target account
        accountRepository.updateAccount(targetAccount);
        logger.info("Transfer completed");
    }
}
