package com.asiaInfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiaInfo.dao.AccountDao;
import com.asiaInfo.domain.Account;

@Service
public class AccountService {

    @Autowired
    private AccountDao dao;

    public Account getAccountById(String id) {
        return dao.getAccountById(id);
    }
	
	public void updateAccount(Account acct) {
        dao.updateAcct(acct);
    }
}