<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>用户管理页面 >> 医生添加页面</span>
    </div>
    <div class="providerAdd">
        <form id="Form" name="regForm" method="post" enctype="multipart/form-data"  action="${pageContext.request.contextPath}/registrationAddSave">
            <input type="hidden" name="method" value="add">
            <!--div的class 为error是验证错误，ok是验证成功-->
            <div>
                <label for="regPatientName">病人名字：</label>
                <input type="text" name="regPatientName" id="regPatientName" value="">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>
            <div>
                <label for="regPatientSymptoms">病人病症：</label>
                <input type="text" name="regPatientSymptoms" id="regPatientSymptoms" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="regClinicName">所挂诊室：</label>
                <input type="text" name="regClinicName" id="regClinicName" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="regDoctorName">所挂医生：</label>
                <input type="text" name="regDoctorName" id="regDoctorName" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="remaining">剩余人数：</label>
                <input type="text" name="remaining" id="remaining" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="regDate">就诊日期：</label>
                <input type="text" Class="Wdate" id="regDate" name="regDate"
                       readonly="readonly" onclick="J.calendar.get({id:'regDate'});">
                <font color="red"></font>
            </div>
            <div>
                <label for="diagnosis">诊治信息：</label>
                <input type="text" name="diagnosis" id="diagnosis" value="">
                <font color="red"></font>
            </div>
            <div class="providerAddBtn">
                <input type="button" name="add" id="add" value="保存" >
                <a href="registrationList"><input type="button" id="back" name="back" value="返回" ></a>
            </div>
        </form>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/registrationAdd.js"></script>