<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">Most Sold</h5>
    <c:forEach items="${mostSoldProduct }" var="item">
    	<p class="card-text">Product Name:<c:out value="${item.product.productName}" /></p>
    </c:forEach>
   
  </div>
</div>