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
        <form id="Form" name="patForm" method="post" action="${pageContext.request.contextPath }/patientModMethod">
            <input type="hidden" name="method" value="modifyexe">
            <input type="hidden" name="patientNo" value="${patient.patientNo}"/>
            <div>
                <label for="patientName">病人姓名：</label>
                <input type="text" name="patientName" id="patientName" value="${patient.patientName}">
                <font color="red">*</font>
            </div>
            <div>
                <label for="patientSex">病人性别：</label>
                <select name="patientSex" id="patientSex">
                    <c:choose>
                        <c:when test="${patient.patientSex.equals('男')}">

                            <option value="女">女</option>                            <option value="男" selected="selected">男</option>
                        </c:when>
                        <c:otherwise>
                            <option value="男">男</option>
                            <option value="女" selected="selected">女</option>
                        </c:otherwise>
                    </c:choose>
                </select>
            </div>

            <div>
                <label for="patientAge">病人年龄：</label>
                <input type="text" name="patientAge" id="patientAge" value="${patient.patientAge}">
            </div>
            <div>
                <label for="patientTel">病人电话：</label>
                <input type="text" name="patientTel" id="patientTel" value="${patient.patientTel}">
            </div>
            <div>
                <label for="patientAddress">病人住址：</label>
                <input type="text" name="patientAddress" id="patientAddress" value="${patient.patientAddress}">
            </div>
            <div class="patientModBtn">
                <input type="button" name="save" id="save" value="保存" />
                <a href="patientList"><input type="button" id="back" name="back" value="返回" ></a>
            </div>
        </form>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/patientMod.js"></script>