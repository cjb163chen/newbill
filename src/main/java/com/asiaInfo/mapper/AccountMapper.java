package com.asiaInfo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;

import com.asiaInfo.domain.Account;

public interface AccountMapper {

    @Select("SELECT acct_id,acct_name,acct_cd FROM account WHERE acct_id = #{id}")
    @Results(value = { @Result(id = true, column = "acct_id", property = "acctId"),
                       @Result(column = "acct_name", property = "acctName"),
					   @Result(column = "acct_cd", property = "acctCd")					   })
					   
    public Account getAccountById(@Param("id") String id);
	
	
	@Insert("INSERT INTO account(acct_id,acct_name,acct_cd) VALUES(#{acctId}, #{acctName}, #{acctCd})")
    public void insert(Account acct);

    @Update("UPDATE account SET acct_name=#{acctName} WHERE acct_id =#{acctId}")
    public void update(Account acct);

    @Delete("DELETE FROM account WHERE acct_id =#{acctId}")
    public void delete(String id);

}