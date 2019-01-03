<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/form" prefix="form" %>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/component/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/component/js/jquery-ui.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/component/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/component/js/placeholders.jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/component/js/placeholders.jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/component/js/bootstrap.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/component/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/component/js/bootstrap-datepicker.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/component/js/dataTables.bootstrap.js"></script>
<link
	href="${pageContext.request.contextPath}/component/css/bootstrap.css"
	rel="stylesheet">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit User</title>
</head>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						var phoneNumbers = [];
						$(".add-row")
								.click(
										function() {
											/*   var name = $("#name").val();
											  var email = $("#email").val(); */
											var index = $('#maintable tbody tr').length;
											var markup = "<tr><td><input type='checkbox' name='record'></td><td><input type='text' id='mobileNumberType' name='dummayList["+index+"].mobileNumberType' class='mobileNumberType' path='dummayList["+index+"].mobileNumberType'/></td>";
											markup += "<td><input type='text' id='mobileNumber' name='dummayList["+index+"].mobileNumber' class='mobileNumber' path='dummayList["+index+"].mobileNumber'/></td></tr>"
											$("table tbody").append(markup);
										});

						$(".delete-row").click(
								function() {
									$("table tbody").find(
											'input[name="record"]').each(
											function() {
												if ($(this).is(":checked")) {
													$(this).parents("tr")
															.remove();
													
												}
											});
								});
						/* $("#add_new").click(function() {

							$("#maintable").each(function() {
								
								var tds = '<tr>';
								jQuery.each($('tr:last td', this), function() {
									tds += '<td>' + $(this).html() + '</td>';
								});
								tds += '</tr>';
								if ($('tbody', this).length > 0) {
									$('tbody', this).append(tds);
								} else {
									$(this).append(tds);
								}
							});
						}); */
					});
</script>
<body>
	<h1>Edit User</h1>
	<form:form method="POST"
		action="${pageContext.request.contextPath }/updateuser"
		modelAttribute="userModel">
		<!-- <form> -->
		<form:label path="id"></form:label>
		<form:hidden path="id" />




		<div class="form-group">
			<form:label path="userName" style="width:21%;margin-left: 32px;">User Name</form:label>
			<form:input type="text" path="userName" class="form-control"
				id="exampleFormControlInput1" style="width:21%;margin-left: 32px;" />
		</div>
		<div class="form-group">
			<form:label path="emailAddress" style="width:21%;margin-left: 32px;">Email</form:label>
			<form:input path="emailAddress" type="email" class="form-control"
				id="exampleFormControlInput1" style="width:21%;margin-left: 32px;" />
		</div>
		<div class="form-group">
			<form:label path="language" style="width:21%;margin-left: 32px;">Select Language</form:label>
			<form:select path="language" class="form-control"
				id="exampleFormControlSelect1" style="width:21%;margin-left: 32px;">
				<form:option value="NONE" label="select"></form:option>
				<form:options items="${languageList}"></form:options>
			</form:select>
		</div>
		<div class="form-group">
			<form:label path="aboutYourSelf" style="width:21%;margin-left: 32px;">ABOUT YOURSELF</form:label>
			<form:textarea path="aboutYourSelf" class="form-control"
				id="exampleFormControlTextarea1" rows="3"
				style="width:21%;margin-left: 32px;" />
		</div>
		<table id="maintable" width="50%" cellpadding="0" cellspacing="0"
			class="pdzn_tbl1" border="#729111 1px solid">
			<thead>
				<tr>
					<th align="center">Select</th>
					<th align="center">Network Type</th>
					<th align="center">Mobile Number</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userModel.dummayList}" var="phoneNumber"
					varStatus="phoneNumberIndex">
					<tr id="rows">
						<div style="padding-left: 5px">
							<td><input type='checkbox' name='record'>
							<td style="padding: 5px;"><form:input type="text"
									id="mobileNumberType" name="mobileNumberType"
									class="mobileNumberType"
									path="dummayList[${phoneNumberIndex.index}].mobileNumberType" /></td>
							<td style="padding: 5px;"><form:input type="text"
									path="dummayList[${phoneNumberIndex.index}].mobileNumber"
									name="mobileNumber" class="mobileNumber" id="mobileNumber" /></td>
						</div>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div id="add_new" type="button" class="add-row btn btn-primary">ADD
			NEW</div>
		<button type="button" class="delete-row btn btn-primary">Delete
			Row</button>
		<button type="submit" class="btn btn-primary"
			style="margin-left: 32px;">Update User Info</button>
		<a class="btn btn-primary"
			href="${pageContext.request.contextPath}/userlist">Show all users</a>
	</form:form>
</body>
</html>