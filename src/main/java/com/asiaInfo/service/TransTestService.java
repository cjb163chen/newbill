package com.asiaInfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiaInfo.dao.AccountDao;
import com.asiaInfo.domain.Account;
import com.asiaInfo.dao.ProdInstDao;
import com.asiaInfo.domain.ProdInst;

@Service
public class TransTestService {

    @Autowired
    private AccountDao dao;
	@Autowired
	private ProdInstDao pdao;
	
	@Transactional
	public void updateAccount(Account acct) {
        dao.updateAcct(acct);
    }
	@Transactional
	public void updateProdInst(ProdInst serv) {
        pdao.updateProdInst(serv);
    }
	
	@Transactional
	public void updateTransTest(Account acct,ProdInst serv) {
		dao.updateAcct(acct);
        pdao.updateProdInst(serv);
    }
}