<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 8/30/2023
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "s"%> <!-- Thư viện để sử dụng tablib (CHÚ Ý SỬA prefix) -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Đăng nhập hệ thống</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--Khai báo sử dụng bootstrap-->
    <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-3.6.0.min.js"/>">
    </script>
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js"/>">
    </script>

    <style type="text/css">
        .row
        {
            padding-bottom: 5px;
        }
        .error
        {
            color:red;
        }
    </style>

</head>
<body>

<s:form action="thucHienDangNhap" method="post" modelAttribute="user">
    <div class="container-fluid">
        <div class="row">
            <label class="col-md-3">
                Tên đăng nhập:
            </label>
            <div class="col-md-9">
                <s:input path="tenDangNhap" cssClass="form-control"/>
                <s:errors path="tenDangNhap" cssClass="error"/>
            </div>
        </div>
        <div class="row">
            <label class="col-md-3">
                Mật khẩu:
            </label>
            <div class="col-md-9">
                <s:input path="matKhau" cssClass="form-control"/>
                <s:errors path="matKhau" cssClass="error"/>
            </div>
        </div>
        <div class="row">
            <label class="col-md-3">

            </label>
            <div class="col-md-9">
                <input type="submit" value="Đăng nhập" class="btn btn-primary"/>
                <a href="#" class="btn btn-danger">Hủy bỏ</a>
            </div>
        </div>
        <div class="row">
            <label class="col-md-3">

            </label>
            <div class="col-md-9">
                <span style="color: red">${thongBao}</span>
            </div>
        </div>
    </div>

</s:form>

</body>
</html>
