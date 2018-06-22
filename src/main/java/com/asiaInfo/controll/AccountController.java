package com.asiaInfo.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asiaInfo.domain.Account;
import com.asiaInfo.service.AccountService;





@RestController
@RequestMapping("/account")

public class AccountController {

    @Autowired
    private AccountService service;


    @RequestMapping(value = "/getAcct", method = RequestMethod.GET)
    public Account getAcct(@RequestParam("id") String id) {
        return service.getAccountById(id);
    }
	
	@RequestMapping(value = "/updateAcct", method = RequestMethod.GET)
    public Account updateAcct(@RequestParam("id") String id,@RequestParam("acctName") String acctName) {
		Account acct = new Account();
		acct.setAcctId(id);
		acct.setAcctName(acctName);
        service.updateAccount(acct);
		return service.getAccountById(id);
    }
	

}