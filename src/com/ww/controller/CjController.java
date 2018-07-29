package com.ww.controller;

import com.ww.model.Cj;
import com.ww.service.CjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * 奖惩信息 控制层
 * 
 * @author Administrator
 * 
 */
@Controller
public class CjController {

	@Autowired
	private CjService cjService;

	/**
	 * 添加奖惩信息
	 * 
	 * @param cj
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/insertCj")
	public void insertCj(@ModelAttribute("cj") Cj cj,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		cjService.insert(cj);
		
		if (null != cj) {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('添加奖惩成功！');window.location.href='selectCj.do';</script>");
		}
	}

	/**
	 * 模糊查询标题奖惩表
	 * 
	 * @param request
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/selectListByCj")
	public String selectListByCj(HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String cjTitle = request.getParameter("name");
		try {
			cjTitle = new String(cjTitle.getBytes("ISO-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(cjTitle);
		String date = request.getParameter("date");
		List<Cj> list = cjService.selectListByCj(cjTitle);
		request.setAttribute("list", list);

//		 for (int i = 0; i < list.size(); i++) {
//		 System.out.println(list.get(i).getCjTitle());
//		 }
		return "jsp/cj/SelectCj.jsp";
	}

	/**
	 * 查询日期奖惩表
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/selectDateByCj")
	public String selectDateByCj(HttpServletRequest request) {
		String date = request.getParameter("date");
		// System.out.println(date);
		List<Cj> list = cjService.selectDateByCj(date);
		request.setAttribute("list", list);
		return "jsp/cj/SelectCj.jsp";
	}

	/**
	 * 查询奖惩表(cj)
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectCj")
	public String selectCj(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		List<Cj> list = cjService.selectCj();
		request.setAttribute("list", list);
//		for (int i = 0; i < list.size(); i++) {
//			 System.out.println(list.get(i).getCjContent());
//			 }
		return "jsp/cj/SelectCj.jsp";
	}

	/**
	 * 通过id删除奖惩记录
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/deleteCj")
	public void deleteCj(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 接受jsp传过来的id，并转换为int类型
		int id = Integer.valueOf(request.getParameter("id"));
		;
		int result = cjService.deleteCj(id);
		System.out.println(result);
		if (result == 0) {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('删除奖惩成功！');window.location.href='selectCj.do';</script>");
		}
	}

}
