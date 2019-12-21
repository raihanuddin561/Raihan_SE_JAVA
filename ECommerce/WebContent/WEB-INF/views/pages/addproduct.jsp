<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<sf:form class="form-horizontal" method="post"
	action="${pageContext.request.contextPath }/addProduct"
	commandName="product">
	<fieldset>

		<!-- Form Name -->
		<legend>Add or Update Product</legend>

		<!-- Text input-->
		<sf:input id="id" path="id" name="id"
					type="hidden" placeholder="" class="form-control input-md" />
		<div class="form-group">
			<label class="col-md-8 control-label" for="productName">Product
				name</label>
			<div class="col-md-8">
				<sf:input id="productName" path="productName" name="productName"
					type="text" placeholder="" class="form-control input-md" />
				<sf:errors path="productName" cssClass="alert-danger"></sf:errors>
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-8 control-label" for="productType">Product
				Type</label>
			<div class="col-md-8">
				<sf:input id="productType" path="productType" name="productType"
					type="text" placeholder="" class="form-control input-md" />
				<sf:errors path="productType" cssClass="alert-danger"></sf:errors>
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-8 control-label" for="quantity">Quantity</label>
			<div class="col-md-8">
				<sf:input id="quantity" path="quantity" name="quantity" type="text"
					placeholder="" class="form-control input-md" />
				<sf:errors path="quantity" cssClass="alert-danger"></sf:errors>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-8 control-label" for="price">Price</label>
			<div class="col-md-8">
				<sf:input id="price" path="price" name="price"
					type="text" placeholder="" class="form-control input-md" />
				<sf:errors path="price" cssClass="alert-danger"></sf:errors>
			</div>
		</div>
		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-8 control-label" for="profitPercentage">Profit
				Percentage</label>
			<div class="col-md-8">
				<sf:input id="profitPercentage" path="profitPercentage"
					name="profitPercentage" type="text" placeholder=""
					class="form-control input-md" />
				<sf:errors path="profitPercentage" cssClass="alert-danger"></sf:errors>
			</div>
		</div>



		
		<!-- Button -->
		<button type="submit" class="btn btn-primary">ADD Product</button>

	</fieldset>
</sf:form>





<!-- This javascript is checking password and confirmpassword same or not -->
<script type="text/javascript">
	var password1 = document.getElementById('password');
	var password2 = document.getElementById('confirmpassword');

	var checkPasswordValidity = function() {
		if (password1.value != password2.value) {
			password1.setCustomValidity("Password didnot matched!");
		} else {
			password1.setCustomValidity('');
		}
	};

	password1.addEventListener('change', checkPasswordValidity, false);
	password2.addEventListener('change', checkPasswordValidity, false);

	var form = document.getElementById('user');
	form.addEventListener('submit', function() {
		checkPasswordValidity();
		if (!this.checkValidity()) {
			event.preventDefault();
			password1.focus();
		}
	}, false);
</script>
