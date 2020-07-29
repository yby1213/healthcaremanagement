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
        <span>诊室信息管理 >> 诊室信息修改页面</span>
    </div>
    <div class="providerAdd">
        <form id="Form" name="cliForm" method="post" action="${pageContext.request.contextPath }/clinicModMethod">
            <input type="hidden" name="method" value="modifyexe">
            <input type="hidden" name="clinicNo" value="${clinic.clinicNo }"/>
            <div>
                <label for="clinicName">诊室名称：</label>
                <input type="text" name="clinicName" id="clinicName" value="${clinic.clinicName }">
                <font color="red">*</font>
            </div>
            <div>
                <label for="clinicAddress">诊室位置：</label>
                <input type="text" name="clinicAddress" id="clinicAddress" value="${clinic.clinicAddress }">
                <font color="red">*</font>
            </div>

            <div>
                <label for="clinicDoc">负责医生：</label>
                <input type="text" name="clinicDoc" id="clinicDoc" value="${clinic.clinicDoc }">
            </div>
            <div>
                <label for="clinicIntroduce">诊室介绍：</label>
                <input type="text" name="clinicIntroduce" id="clinicIntroduce" value="${clinic.clinicIntroduce }">
            </div>
            <div class="clinicModBtn">
                <input type="button" name="mod" id="mod" value="保存" />
                <a href="clinicList"><input type="button" id="back" name="back" value="返回" ></a>
            </div>
        </form>
    </div>
</div>
</section>
<script src="../../../statics/js/clinicMod.js" type="text/javascript"></script>
<%@include file="../common/foot.jsp" %>
