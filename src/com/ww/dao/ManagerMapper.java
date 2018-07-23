package com.ww.dao;

import com.ww.model.Manager;
import com.ww.model.ManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
    int countByExample(ManagerExample example);

    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Manager record);

    int insertSelective(Manager record);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
    //登录
    Manager login(@Param("account")String account,@Param("password")String password,
    		@Param("managerlevel")String managerlevel);
    //先判断账号密码是否存在(没有状态值)
    Manager updateLogin(@Param("account")String account,
    		@Param("password")String password);
    		
    //修改用户
    int update(@Param("account")String account,@Param("password")String password);
}