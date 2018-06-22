package com.asiaInfo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.asiaInfo.db.DatabaseContextHolder;
import com.asiaInfo.db.DatabaseType;
import com.asiaInfo.domain.ProdInst;
import com.asiaInfo.mapper.ProdInstMapper;

@Repository
public class ProdInstDao {
    @Autowired
    private ProdInstMapper mapper;

    /**
     * 获取accouunt
     */
    public ProdInst getProdInstById(String id) {
        DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb2);
        return mapper.getProdInstById(id);
    }
	

	
	public void updateProdInst(ProdInst serv) {
        DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb2);
         mapper.update(serv);
    }
	
	
	
}