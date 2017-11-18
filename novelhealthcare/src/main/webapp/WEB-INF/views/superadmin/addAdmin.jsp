<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<div class="col-xs-12">

		<form:form action="./addAdmin"  commandName="adminBean"  method="post">
			<input name="__RequestVerificationToken" type="hidden"
				value="rzKFyMGMdeCS8NPQ697rJ1LofGHPBa-DZmkrUruH3f2DWJa2UhN1-kyYUTHei7Zeu2qoWFTTt-xvd5Syf9Qa1LcQqeowAX9Q8E6K4Jwf-8U1">
			<div class="box box-primary">
				<div class="box-header"></div>
				<div class="box-body">
					<div class="message-box"></div>
					<div class="row">
						<div class="col-md-9">
							<div class="row">
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label"> <label for="User_CompanyId">Hospital</label> <span class="required">*</span>
										</label> 
										<form:select path="hospital" class="form-control"   id="User_CompanyId"
											name="User.CompanyId" style="">
										
														<form:option value="">-- Select Hospital --</form:option>
																<form:options items="${hospNameList}" var="hospital"></form:options>
										</form:select> 
										<span class="field-validation-valid" data-valmsg-for="User.CompanyId" data-valmsg-replace="true"></span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label"> <label for="User_MiddleName">First Name</label> <span class="required">*</span>
										</label> 
										<form:input path="firstName" class="form-control"  id="User_MiddleName" maxlength="50"
											name="User.MiddleName" type="text" value=""></form:input> 
											<span class="field-validation-valid" data-valmsg-for="User.MiddleName"
											data-valmsg-replace="true"></span>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label"> <label for="User_MiddleName">Middle Name</label> <span class="required">*</span>
										</label> 
										<form:input path="middleName" class="form-control"  id="User_MiddleName" maxlength="50"
											name="User.MiddleName" type="text" value=""></form:input> 
											<span class="field-validation-valid" data-valmsg-for="User.MiddleName"
											data-valmsg-replace="true"></span>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label"> <label for="User_LastName">Last Name</label> <span class="required">*</span>
										</label> <form:input path="lastName" class="form-control"  maxlength="50"
											name="User.LastName" type="text" value=""></form:input> 
											<span class="field-validation-valid" data-valmsg-for="User.LastName"
											data-valmsg-replace="true"></span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label"> <label for="User_Phone">Phone</label> <span class="required">*</span>
										</label> <form:input path="phone" class="form-control"  maxlength="50"
											name="User.Phone" type="text" value=""></form:input>
											<span class="field-validation-valid" data-valmsg-for="User.Phone"
											data-valmsg-replace="true"></span>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label"> <label for="User_Email">Email (User Name)</label> <span class="required">*</span>
										</label> 
									<form:input path="email" class="form-control" id="emailid" placeholder="Enter Email " value=""></form:input>
										<span class="field-validation-valid" data-valmsg-for="User.Email" data-valmsg-replace="true"></span>
									</div>
								</div>
								
								
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="form-group">
						<div class="col-xs-offset-3 col-xs-10">
							<input type="submit" value="addAdmin" class="btn btn-primary">
						</div>
					</div>
		</form:form>
	</div>

</body>
</html>