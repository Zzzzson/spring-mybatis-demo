<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <form name="form1" method="post" action="/springmvc/login"> 
      <table>
          <tr>
              <td>Name:</td>
              <td><input type="text" id="name" name="name"> </td>
          </tr>
          <tr>
              <td>Password:</td>
              <td><input type="password" id="passwork" name="password"> </td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="login" />
              </td>
          </tr>
      </table>
  </form>
  <form name="form2" method="post" action="/springmvc/signPage">
  		<input type="submit" value="sign" />
  </form>
	<%-- <form:form commandName="user" modelAttribute="user" action="login" method="post">
		<table>
          <tr>
              <td>Name:</td>
              <td><form:input path="name" /></td>
          </tr>
          <tr>
              <td>Password:</td>
              <td><form:input path="password" /></td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>
	</form:form> --%>
</body>
</html>