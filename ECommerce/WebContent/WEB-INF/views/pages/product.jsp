<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">#</th>
				<th scope="col">Product Name</th>
				<th scope="col">Product Type</th>
				<th scope="col">Available Quantity</th>
				<th scope="col">Price</th>
				
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${product}">
				<tr>

					<td><c:out value="${row.id}"></c:out></td>
					<td><c:out value="${row.productName}"></c:out></td>
					<td><c:out value="${row.productType}"></c:out></td>
					<td><c:out value="${row.quantity}"></c:out></td>
					<td><c:out value="${row.price}"></c:out></td>
					
					<td><a onclick="if(!(confirm('Are you sure to delete the product'))) return false" href="<c:url value='/deleteproduct?pid=${row.id}'></c:url>">Delete</a>|<a href="<c:url value='/updateproduct?pid=${row.id}'></c:url>">Update</a></td>
				</tr>
			</c:forEach>


		</tbody>
	</table>

</body>
</html>