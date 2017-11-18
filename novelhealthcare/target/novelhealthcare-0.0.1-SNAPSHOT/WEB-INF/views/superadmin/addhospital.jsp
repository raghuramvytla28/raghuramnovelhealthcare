<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href='<core:url value="/resources/css/bootstrap.min.css"/>'>
<link rel="stylesheet" href='<core:url value="/resources/css/signup.css"/>'>
<!-- jQuery -->
<script src='<core:url value="/resources/js/jquery.js"/>'></script>
<!-- Bootstrap Core JavaScript -->
<script src='<core:url value="/resources/js/bootstrap.min.js"/>'></script>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<section> <!--   <hr> --> <form:form action="./addHopital" commandName="hospitalBean" method="POST" name="signup"
					onsubmit="return signup()" class="form-horizontal" id="signup">
					<div class="form-group">
						<label class="control-label col-sm-3">HospitalName <span class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<form:input path="hospitalName" class="form-control" id="mem_name" placeholder="Enter hospitalName " value=""></form:input>
							<form:errors path="hospitalName" />
							<span id="sfname"></span>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Address1 <span class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<form:input path="address1" class="form-control" id="mem_name" placeholder="Enter Address1 " value=""></form:input>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Address2 <span class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<form:input path="address2" class="form-control" id="mem_name" placeholder="Enter Address2" value=""></form:input>
							<form:errors path="address2"></form:errors>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">City <span class="text-danger">*</span></label>
							<div class="col-md-5 col-sm-8">
								<div class="col-md-8 col-sm-9">
									
									<form:input path="city" class="form-control" id="password" placeholder="Enter City" value=""></form:input>
									<form:errors path="city"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Email <span class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
								<form:input path="email" class="form-control" id="emailid" placeholder="Enter Email " value=""></form:input>
								<form:errors path="email"></form:errors>

							</div>
							<small> Your Email Id is being used for ensuring the security of your account, authorization and access recovery. </small>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">State Name<span class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<form:input path="state" class="form-control" id="mem_name" placeholder="Enter State Name" value=""></form:input>
							<form:errors path="state"></form:errors>
							<span style="color: red">${message1}</span>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Zipcode <span class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
								<form:input path="zipcode" class="form-control" id="password" placeholder="Enter Zipcode (5-15 chars)" value=""></form:input>
								<form:errors path="zipcode"></form:errors>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">PhoneNumber <span class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
								<form:input path="phoneno" class="form-control" id="password" placeholder="Enter PhoneNumber" value=""></form:input>
								<form:errors path="phoneno"></form:errors>
							</div>
						</div>
					</div>



					<div class="form-group">
						<label class="control-label col-sm-3">Fax <span class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
								<form:input path="fax" class="form-control" id="password" placeholder="Enter Fax" value=""></form:input>
								<form:errors path="fax"></form:errors>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Logo <span class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
								<form:input path="logo" class="form-control" id="password" placeholder="Attach Logo " value=""></form:input>
								<form:errors path="logo"></form:errors>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Status <span class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
								<form:input path="status" class="form-control" id="password" placeholder="Enter Status" value=""></form:input>
								<form:errors path="status"></form:errors>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Registration Document <span class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
								<form:input path="registrationDoc" class="form-control" id="password" placeholder="attach document" value=""></form:input>
								<form:errors path="registrationDoc"></form:errors>
							</div>
						</div>
					</div>



					<div class="form-group">
						<div class="col-xs-offset-3 col-xs-10">
							<input type="submit" value="addHospital" class="btn btn-primary">
						</div>
					</div>

				</form:form>
			</div>
		</div>
	</div>
</body>
</html>