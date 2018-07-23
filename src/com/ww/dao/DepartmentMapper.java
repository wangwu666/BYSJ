package com.ww.dao;

import com.ww.model.Department;
import com.ww.model.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
	int countByExample(DepartmentExample example);

	int deleteByExample(DepartmentExample example);

	// 通过id来删除部门记录
	int deleteByPrimaryKey(Integer id);

	// 添加部门
	int insert(Department record);

	int insertSelective(Department record);

	List<Department> selectByExample(DepartmentExample example);

	// 通过部门名称查询部门表
	List<Department> selectDepartmentByName(String name);


	// 查询部门表
	List<Department> selectDepartment();

	Department selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Department record,
			@Param("example") DepartmentExample example);

	int updateByExample(@Param("record") Department record,
			@Param("example") DepartmentExample example);

	int updateByPrimaryKeySelective(Department record);

	int updateByPrimaryKey(Department record);
}