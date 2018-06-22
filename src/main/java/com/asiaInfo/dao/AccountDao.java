package com.asiaInfo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.asiaInfo.db.DatabaseContextHolder;
import com.asiaInfo.db.DatabaseType;
import com.asiaInfo.domain.Account;
import com.asiaInfo.mapper.AccountMapper;

@Repository
public class AccountDao {
    @Autowired
    private AccountMapper mapper;

    /**
     * 获取accouunt
     */
    public Account getAccountById(String id) {
        DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb2);
        return mapper.getAccountById(id);
    }
	
	
	public void insertAcct(Account acct) {
        DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb2);
        mapper.insert(acct);
    }
	
	public void updateAcct(Account acct) {
        DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb2);
         mapper.update(acct);
    }
	
	public void deleteAcct(String  id) {
        DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb2);
        mapper.delete(id);
    }
	
}