<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 10/11/2023
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quản Lý Sản Phẩm</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--Khai báo sử dụng bootstrap-->
    <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-3.6.0.min.js"/>">
    </script>
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js"/>">
    </script>
</head>
<body>
<!-- Khai báo các url cho controller-->
<c:url value="/admin/them-SP" var="urlSave"/>
<c:url value="/admin/sua-SP" var="urlUpdate"/>
<c:url value="/admin/xoa-SP" var="urlDelete"/>
<c:url value="/images/" var="urlImage"/>

<!--Form thông tin tìm kiếm theo từ khóa và mã sản phẩm-->
<s:form method="post" action="${urlDanhSachSanPham}" modelAttribute="sanPham">
    <fieldset class="container">
        <legend>Nhập thông tin tìm kiếm</legend>
        <div class="row">
            <label class="col-md-2">Từ khóa:</label>
            <div class="col-md-4">
                <s:input path="tuKhoa" cssClass="form-control"/>
            </div>
            <label class="col-md-1">Loại sản phẩm:</label>
            <div class="col-md-3">
                <s:select path="maSanPham" cssClass="form-control">
                    <s:option value="">---Chọn loại sản phẩm---</s:option>
                    <s:options items="${lstLoaiSP}"/>
                </s:select>
            </div>
            <div class="col-md-2">
                <input type="submit" name="btnTimKiem" class="btn btn-primary" value="Tìm kiếm"/>
            </div>
        </div>
    </fieldset>
</s:form>



<h1 style="text-align: center;">Danh sách sản phẩm</h1>

<div style="text-align: right;">
    <a class="btn btn-primary" href="${urlSave}">Thêm mới</a>
</div>
<br>
<br>

<table id="sampleTable" class="table table-bordered table-striped" border="1"
       style="border-collapse: collapse;width: 100%;">
    <thead>
    <tr>
        <td>Ảnh sản phẩm</td>
        <td>Mã sản phẩm</td>
        <td>Tên sản phẩm</td>
        <td>Nhà sản xuất</td>
        <td>Cấu hình</td>
        <td>Giá</td>
        <td>Mã Loại sản phẩm</td>
        <td>Số lượng</td>
        <td>Sửa</td>
        <td>Xóa</td>
    </tr>
    </thead>
    <c:if test="${not empty lstSP}">
        <tbody>
        <c:forEach var="sp" items="${lstSP}">
            <tr>
                <td><img class="img-thumbnail" src="${urlImage}/${sp.anhSP}"/></td>
                <td>${sp.maSP}</td>
                <td>${sp.tenSP}</td>
                <td>${sp.nhaSanXuat}</td>
                <td>${sp.cauHinh}</td>
                <td>${sp.giaSP}</td>
                <td>${sp.maLoaiSP}</td>
                <td>${sp.soLuong}</td>

                <td><a class="btn btn-xs btn-info" href="${urlUpdate}/${sp.maSP}"><i
                        class="fa fa-pencil-square-o"></i></a></td>

                <td><a class="btn btn-xs btn-danger" href="${urlDelete}/${sp.maSP}"
                       onclick="return confirm('Bạn có chắc chắn muốn xóa thông tin này ?')"><i
                        class="fa fa-trash-o"></i></a></td>
            </tr>
        </c:forEach>
        </tbody>
    </c:if>
</table>

</body>
</html>
