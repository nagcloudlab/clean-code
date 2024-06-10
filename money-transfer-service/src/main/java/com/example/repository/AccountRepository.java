package com.example.repository;

import com.example.model.Account;

public interface AccountRepository {
    public Account loadAccount(String accountNumber);
    public void updateAccount(Account account);
}
