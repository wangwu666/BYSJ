package com.ww.dao;

import com.ww.model.Pay;
import com.ww.model.PayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayMapper {
    int countByExample(PayExample example);

    int deleteByExample(PayExample example);

    //通过id进行删除
    int deleteByPrimaryKey(Integer id);
    //通过id来添加
    int insert(Pay record);

    int insertSelective(Pay record);

    List<Pay> selectByExample(PayExample example);
    
    //查询薪资表
    List<Pay> selectPay();
    
    //通过模糊姓名条件查询
    List<Pay> selectList(String name);
    
    //通过日期查询
    List<Pay> selectDate(String date);
    
    Pay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pay record, @Param("example") PayExample example);

    int updateByExample(@Param("record") Pay record, @Param("example") PayExample example);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);
}