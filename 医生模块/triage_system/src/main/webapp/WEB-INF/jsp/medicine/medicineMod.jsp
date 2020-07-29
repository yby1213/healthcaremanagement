<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>病人信息管理 >> 病人信息修改页面</span>
    </div>
    <div class="providerAdd">
        <form id="Form" name="regForm" method="post" action="${pageContext.request.contextPath }/medicineModMethod">
            <input type="hidden" name="method" value="modifyexe">
            <input type="hidden" name="medicineNo" value="${medicine.medicineNo}"/>
            <div>
                <label for="medicineName">药品名称：</label>
                <input type="text" name="medicineName" id="medicineName" value="${medicine.medicineName}">
                <font color="red">*</font>
            </div>
            <div>
                <label for="medicineDisease">所治病症：</label>
                <input type="text" name="medicineDisease" id="medicineDisease" value="${medicine.medicineDisease}">
                <font color="red">*</font>
            </div>

            <div>
                <label for="medicineDoses">应用剂量：</label>
                <input type="text" name="medicineDoses" id="medicineDoses" value="${medicine.medicineDoses}">
            </div>
            <div class="regModBtn">
                <input type="button" name="mod" id="mod" value="保存" />
                <a href="medicineList"><input type="button" id="back" name="back" value="返回" ></a>
            </div>
        </form>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/medicineMod.js"></script>