<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
		<tr><td colspan="3">学生基本信息</td></tr>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
		</tr>
		<c:forEach items="${list['info1']}" var="obj">
			<tr>
				<td>${obj.sid }</td>
				<td>${obj.sname}</td>
				<td>${obj.sage}</td>
			</tr>
		</c:forEach>
		增加信息:
	</table>
</body>
</html>