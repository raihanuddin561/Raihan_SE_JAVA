<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action='' method='POST' ">
  <div class="form-group">
    <label for="username">Username</label>
    <input type="text" class="form-control" id="username" name="username" />
    <c:if test="${param.error != null}">
						<span style="color: red">Invalid username or password</span>
					</c:if>
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" name="password" />
  </div>
  <h3><a href="<c:url value='/createuser'></c:url>"> Create Account</a></h3> 
  <input name="${_csrf.parameterName}" type="hidden"
							value="${_csrf.token}" />
  <button type="submit" class="btn btn-primary">Login</button>
</form>
</body>
</html>