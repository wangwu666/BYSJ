package com.ww.dao;

import com.ww.model.Employee;
import com.ww.model.Invitejob;
import com.ww.model.InvitejobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvitejobMapper {
	int countByExample(InvitejobExample example);

	int deleteByExample(InvitejobExample example);

	// 通过id来删除
	int deleteByPrimaryKey(Integer id);

	// 添加招聘员工
	int insert(Invitejob record);

	int insertSelective(Invitejob record);

	List<Invitejob> selectByExampleWithBLOBs(InvitejobExample example);

	List<Invitejob> selectByExample(InvitejobExample example);

	// 查总数招聘表
	int queryGoodsTotalPay();

	// 查询显示招聘表
	List<Invitejob> goodsListByPagePay(@Param("pagesize") int pagesize,
			@Param("startIndex") int startIndex);

	// 通过id详细查询显示Invitejob
	List<Invitejob> selectByPrimaryKey(Integer id);

	// 通过非录用查询显示Invitejob
	List<Invitejob> selectInvitejobNotEnroll();

	// 通过录用查询显示Invitejob
	List<Invitejob> selectInvitejobEnroll();

	int updateByExampleSelective(@Param("record") Invitejob record,
			@Param("example") InvitejobExample example);

	int updateByExampleWithBLOBs(@Param("record") Invitejob record,
			@Param("example") InvitejobExample example);

	int updateByExample(@Param("record") Invitejob record,
			@Param("example") InvitejobExample example);

	int updateByPrimaryKeySelective(Invitejob record);

	int updateByPrimaryKeyWithBLOBs(Invitejob record);

	int updateByPrimaryKey(Invitejob record);

	// 通过id修改invite的录取状态
	int updateByPrimaryKey1(Integer id);
}