package com.ww.dao;

import com.ww.model.Employee;
import com.ww.model.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
	int countByExample(EmployeeExample example);

	int deleteByExample(EmployeeExample example);

	// 通过id来删除
	int deleteByPrimaryKey(Integer id);

	// 添加员工
	int insert(Employee record);

	int insertSelective(Employee record);

	List<Employee> selectByExample(EmployeeExample example);

	// 查找所有员工的数据
	List<Employee> selectByExample1(EmployeeExample example);

	// 以dtname为条件查询显示员工表的所有信息(基础部)
	List<Employee> selectByExampleJava(EmployeeExample example);

	Employee selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Employee record,
			@Param("example") EmployeeExample example);

	int updateByExample(@Param("record") Employee record,
			@Param("example") EmployeeExample example);

	int updateByPrimaryKeySelective(Employee record);

	int updateByPrimaryKey(Employee record);

	// 通过id来修改员工信息
	int updateEmployeeById(Employee employee);

	// 查总数员工表
	int queryGoodsTotal();

	// 分页查员工表
	List<Employee> queryGoodsByPage(@Param("pagesize") int pagesize,
			@Param("startIndex") int startIndex);
}