package com.example;

import com.example.repository.AccountRepository;
import com.example.repository.AccountRepositoryFactory;
import com.example.service.TransferService;
import com.example.service.UpiTransferService;

public class Application {

    public static void main(String[] args) {

        //--------------------------------------------
        // 1. init / boot phase
        //--------------------------------------------
        System.out.println("-".repeat(100));
        // based on configuration, prepare the application
        AccountRepository sqlAccountRepository = AccountRepositoryFactory.getAccountRepository("SQL");
        AccountRepository noSqlAccountRepository = AccountRepositoryFactory.getAccountRepository("NOSQL");
        TransferService transferService = new UpiTransferService(sqlAccountRepository); // DI

        System.out.println("-".repeat(100));
        //--------------------------------------------
        // 2. use phase
        //--------------------------------------------

        // transfer money from account1 to account2
        transferService.transfer("123", "456", 100);
        System.out.println();
        // transfer money from account2 to account1
        transferService.transfer("456", "123", 50);

        //--------------------------------------------
        // 3. shutdown phase
        //--------------------------------------------
        System.out.println("-".repeat(100));

        System.out.println("-".repeat(100));


    }
}
