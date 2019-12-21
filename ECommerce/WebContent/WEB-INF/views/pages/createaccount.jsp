<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


			<sf:form class="form-horizontal" method="post"
				action="${pageContext.request.contextPath }/createuser?${_csrf.parameterName}=${_csrf.token}"
				commandName="user">
				<fieldset>

					<!-- Form Name -->
					<legend>Create User</legend>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-8 control-label" for="name">User name</label>
						<div class="col-md-8">
							<sf:input id="username" path="username" name="username"
								type="text" placeholder="" class="form-control input-md" />
							<sf:errors path="username" cssClass="alert-danger"></sf:errors>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-8 control-label" for="name">First
							name</label>
						<div class="col-md-8">
							<sf:input id="firstname" path="firstname" name="firstname"
								type="text" placeholder="" class="form-control input-md" />
							<sf:errors path="firstname" cssClass="alert-danger"></sf:errors>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-8 control-label" for="name">Last name</label>
						<div class="col-md-8">
							<sf:input id="lastname" path="lastname" name="lastname"
								type="text" placeholder="" class="form-control input-md" />
							<sf:errors path="lastname" cssClass="alert-danger"></sf:errors>
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-8 control-label" for="email">Email</label>
						<div class="col-md-8">
							<sf:input id="email" path="email" name="email" type="text"
								placeholder="" class="form-control input-md" />
							<sf:errors path="email" cssClass="alert-danger"></sf:errors>
						</div>
					</div>

					<!-- password -->
					<div class="form-group">
						<label class="col-md-8 control-label" for="password">Password</label>
						<div class="col-md-8">
							<sf:input id="password" path="password" name="password"
								type="password" placeholder="" class="form-control input-md" />
							<sf:errors path="password" cssClass="alert-danger"></sf:errors>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-8 control-label" for="confirmpassword">Confirm
							Password</label>
						<div class="col-md-8">
							<input id="confirmpassword" name="confirmpassword"
								type="password" placeholder="" class="form-control input-md" />
						</div>
					</div>


					
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
					<!-- Button -->
					<button type="submit" class="btn btn-primary">Login</button>

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
