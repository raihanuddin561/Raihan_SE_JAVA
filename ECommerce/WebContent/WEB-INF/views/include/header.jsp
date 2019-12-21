
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
	<a class="navbar-brand" href="#"> E-Commerce </a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarsExampleDefault"
		aria-controls="navbarsExampleDefault" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarsExampleDefault">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link"
				href="${pageContext.request.contextPath }/">Home <span
					class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath }/about">About</a></li>
			<sec:authorize access="isAuthenticated()">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath }/dashboard">Dash Board</a></li>
			</sec:authorize>
			<sec:authorize access="isAuthenticated()">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath }/saleProduct">Sale Product</a></li>
			</sec:authorize>
			<sec:authorize access="hasRole('ROLE_ADMIN')">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath }/addProduct">Add
						Product</a></li>
			</sec:authorize>
			<sec:authorize access="isAuthenticated()">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath }/product">Product</a></li>
			</sec:authorize>

		</ul>
		<ul class="nav navbar-nav nav-right">
			<li><sec:authorize access="!isAuthenticated()">
					<p>
						<a href="<c:url value='/login'/>">Login</a>
					</p>
				</sec:authorize></li>
			<li><sec:authorize access="isAuthenticated()">
					<div class="dropdown">
						<a class="btn btn-secondary dropdown-toggle" href="#"
							role="button" id="dropdownMenuLink" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false"> <sec:authentication
								property="principal.username" />
						</a>

						<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
							<c:url var="logoutUrl" value="/loggedout"></c:url>
							<form action="${logoutUrl }" method="post" class="dropdown-item">
								<input type="submit" value="Logout" /> <input type="hidden"
									name="${_csrf.parameterName}" value="${_csrf.token}" />
							</form>

						</div>
					</div>


				</sec:authorize></li>
		</ul>
	</div>
</nav>
