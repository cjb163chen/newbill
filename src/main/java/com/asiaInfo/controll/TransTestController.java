package com.asiaInfo.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asiaInfo.domain.Account;
import com.asiaInfo.domain.ProdInst;
import com.asiaInfo.service.TransTestService;



@RestController
@RequestMapping("/test")
public class TransTestController {

    @Autowired
    private TransTestService service;
	


	@RequestMapping(value = "/tranTest", method = RequestMethod.GET)
    public void tranTest(@RequestParam("id") String id,@RequestParam("acctName") String acctName,@RequestParam("prodInstId") String prodInstId) {
		Account acct = new Account();
		acct.setAcctId(id);
		acct.setAcctName(acctName);
      //  service.updateAccount(acct);
		
		ProdInst serv = new ProdInst();
		serv.setProdInstId(prodInstId);
		serv.setRemark(acctName);
      //  service.updateProdInst(serv);		
		
		service.updateTransTest(acct,serv);
		
		
		
		//return service.getAccountById(id);
    }

}