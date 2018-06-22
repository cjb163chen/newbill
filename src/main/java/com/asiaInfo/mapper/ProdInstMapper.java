package com.asiaInfo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;

import com.asiaInfo.domain.ProdInst;

public interface ProdInstMapper {

    @Select("SELECT prod_inst_id,remark FROM prod_inst WHERE prod_inst_id = #{id}")
    @Results(value = { @Result(id = true, column = "prod_inst_id", property = "prodInstId")
                                               	})
					   
    public ProdInst getProdInstById(@Param("id") String id);
	
	


    @Update("UPDATE prod_inst SET remark=#{remark} WHERE prod_inst_id =#{prodInstId}")
    public void update(ProdInst serv);



}