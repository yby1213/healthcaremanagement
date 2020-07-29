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
        <form id="Form" name="regForm" method="post" action="${pageContext.request.contextPath}/registrationModSave">
            <input type="hidden" name="method" value="modifyexe">
            <input type="hidden" name="regNo" value="${regList.regNo}"/>
            <div>
                <label for="regPatientName">病人姓名：</label>
                <input type="text" name="regPatientName" id="regPatientName" value="${regList.regPatientName}">
                <font color="red">*</font>
            </div>
            <div>
                <label for="regPatientSymptoms">病人病症：</label>
                <input type="text" name="regPatientSymptoms" id="regPatientSymptoms" value="${regList.regPatientSymptoms}">
                <font color="red">*</font>
            </div>

            <div>
                <label for="regClinicName">所挂诊室：</label>
                <input type="text" name="regClinicName" id="regClinicName" value="${regList.regClinicName}">
            </div>
            <div>
                <label for="regDoctorName">所挂医生：</label>
                <input type="text" name="regDoctorName" id="regDoctorName" value="${regList.regDoctorName}">
            </div>
            <div class="msg">
                <label for="diagnosis">诊治信息：</label>
                <input type="hidden" name="diagnosis" id="diagnosis" value="${regList.diagnosis}">
                <select class="dia1">
                    <option value="未使用药" selected="selected">--请选择药品--</option>
                    <c:forEach var="medicine" items="${medicineList}" varStatus="status">
                        <option value="${medicine.medicineName}" >${medicine.medicineName}</option>
                    </c:forEach>
                </select>
                <select class="dia2">
                    <option value="未使用次数" selected="selected">--请选择次数--</option>
                    <option value="一天一次">一天一次</option>
                    <option value="一天两次">一天两次</option>
                    <option value="一天三次">一天三次</option>
                </select>
                <select class="dia3">
                    <option value="未使用剂量" selected="selected">--请选择剂量--</option>
                    <option value="一次一粒">一次一粒</option>
                    <option value="一次两粒">一次两粒</option>
                    <option value="一次三粒">一次三粒</option>
                </select>
            </div>
            <div class="regModBtn">
                <input type="button" name="save" id="save" value="保存" />
                <a href="registrationList"><input type="button" id="back" name="back" value="返回" ></a>
            </div>
        </form>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/registrationMod.js"></script>