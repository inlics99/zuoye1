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
		
		<form action="add" method="post" >
			<table >
				<tr><td colspan="3">增加信息</td></tr>
				<tr>
					<td>编号</td>
					<td>姓名</td>
					<td>年龄</td>
				</tr>
				<tr>
				  <td><input type="text" name="id" value="" /></td>
				  <td><input type="text" name="name" value="" /></td>
				  <td><input type="text" name="age" value="" /></td>
				</tr>
				<tr><td colspan="3"> <input type="submit" value="提交"/> </td></tr>
			</table>
		</form>
		
</body>
</html>