package com.example.repository;

/*
    Factory Class with Factory Method
     - Isolate complex creation logic from the client.
  */

public class AccountRepositoryFactory {
    public static AccountRepository getAccountRepository(String repositoryType) {
        if (repositoryType == null) {
            return null;
        }
        if (repositoryType.equalsIgnoreCase("SQL")) {
            return new SqlAccountRepository();
        } else if (repositoryType.equalsIgnoreCase("NOSQL")) {
            return new NoSqlAccountRepository();
        }
        return null;
    }
}
