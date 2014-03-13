<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty lists}">
		<table border="8">
			<c:forEach var="listValue" items="${lists}">
				<tr>
					<td>Name: ${listValue.name}</td>
					<td>Password: ${listValue.password}</td>
					<form action="update">
						<input name="id" id="id" value="${listValue.id }"
							style="display: none"> <input name="name" id="name"
							value="${listValue.name }" style="display: none">
						<td>new password: <input name="password" id="password"></td>
						<td><input type="submit" value="change"></td>
					</form>
					<form action="delete">
						<input name="id" id="id" value="${listValue.id }"
							style="display: none"> 
						<td><input type="submit" value="delete"></td>
					</form>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>