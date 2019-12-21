<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<sf:form class="form-horizontal" method="post"
	action="${pageContext.request.contextPath }/saleProduct"
	commandName="saleInfo">
	<fieldset>

		<!-- Form Name -->
		<legend>Sale Product</legend>

		<!-- Text input-->
		<sf:input id="saleId" path="saleId" name="id"
					type="hidden" placeholder="" class="form-control input-md" />
		<div class="form-group">
			<label class="col-md-8 control-label" for="product.id">Product
				id</label>
			<div class="col-md-8">
				<sf:input id="product.id" path="product.id" name="product.id"
					type="text" placeholder="" class="form-control input-md" />
				<sf:errors path="product.id" cssClass="alert-danger"></sf:errors>
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-8 control-label" for="saleQuantity">Quantity
				Type</label>
			<div class="col-md-8">
				<sf:input id="saleQuantity" path="saleQuantity" name="saleQuantity"
					type="text" placeholder="" class="form-control input-md" />
				<sf:errors path="saleQuantity" cssClass="alert-danger"></sf:errors>
			</div>
		</div>

		

		
		<!-- Button -->
		<button type="submit" class="btn btn-primary">Sale Product</button>

	</fieldset>
</sf:form>





<!-- This javascript is checking password and confirmpassword same or not -->

