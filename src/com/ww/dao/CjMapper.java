package com.ww.dao;

import com.ww.model.Cj;
import com.ww.model.CjExample;
import com.ww.model.Pay;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CjMapper {
	
	List<Cj> countByExample();
	//查询奖惩表(cj)
	List<Cj> selectCj();
	
    int deleteByExample(CjExample example);
  //通过id来删除招聘记录
    int deleteByPrimaryKey(Integer id);
    //添加奖惩信息 
    int insert(Cj record);

    int insertSelective(Cj record);
    
    //通过模糊姓名条件查询奖惩表
    List<Cj> selectListByCj(String name);
    
    //通过日期查询奖惩表
    List<Cj> selectDateByCj(String date);
    
    List<Cj> selectByExampleWithBLOBs(CjExample example);

    List<Cj> selectByExample(CjExample example);

    Cj selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cj record, @Param("example") CjExample example);

    int updateByExampleWithBLOBs(@Param("record") Cj record, @Param("example") CjExample example);

    int updateByExample(@Param("record") Cj record, @Param("example") CjExample example);

    int updateByPrimaryKeySelective(Cj record);

    int updateByPrimaryKeyWithBLOBs(Cj record);

    int updateByPrimaryKey(Cj record);
}