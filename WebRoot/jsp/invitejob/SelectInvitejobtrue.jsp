<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	//List list = (List)request.getAttribute("list");
	//System.out.println("true"+list.size());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'SelectInvitejobtrue.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<input type="button" name="Submit"
			onclick="javascript:history.back(-1);" value="返回">
	</head>


	<body>
		<table>
			<tr>
				<th>
					编号
				</th>
				<th>
					姓名
				</th>
				<th>
					性别
				</th>
				<th>
					应聘职务
				</th>
				<th>
					文化程度
				</th>
				<th>
					工作经验
				</th>
				
			</tr>
			<s:forEach items="${list}" var="s">
				<tr>

					<td>
						${s.getId()}
					</td>
					<td>
						${s.getName()}
					</td>
					<td>
						${s.getSex() }
					</td>

					<td>
						${s.getJob()}
					</td>

					<td>
						${s.getTeachschool()}
					</td>
					<td>
						${s.getExperience()}
					</td>

				</tr>

			</s:forEach>
		</table>
	</body>
</html>
