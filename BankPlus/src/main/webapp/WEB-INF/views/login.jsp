<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap -->
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCSS"></spring:url>
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJS"></spring:url>
<spring:url value="/resources/jquery/jquery-3.1.0.min.js" var="jquery"></spring:url>
<link href="${bootstrapCSS}" rel="stylesheet" >
<script src="${bootstrapJS}"></script>
<script src="${jquery}"></script>
</head>
<body>
  <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign In</h5>
             <form:form id="formLoginId" method="POST" action="login" modelAttribute="loginDto">
              <div class="form-label-group">
              	<form:errors path="userName" cssStyle="color:red;display:block"></form:errors>
              	<form:input path="userName" class="form-control" placeholder="Tên đăng nhập"/>
                <label for="userName">User Name</label>
              </div>
              <div class="form-label-group">
              	<form:errors path="passWord" cssStyle="color:red;display:block"></form:errors>
                <form:input path="passWord" class="form-control" placeholder="PassWord"/>
                <label for="passWord">Password</label>
              </div>

              <div class="custom-control custom-checkbox mb-3">
                <input type="checkbox" class="custom-control-input" id="customCheck1">
                <label class="custom-control-label" for="customCheck1">Remember password</label>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
              </form:form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>