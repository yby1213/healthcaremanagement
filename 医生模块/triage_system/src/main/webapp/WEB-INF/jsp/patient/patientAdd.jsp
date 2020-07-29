<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>用户管理页面 >> 医生添加页面</span>
    </div>
    <div class="providerAdd">
        <form id="Form" name="patForm" method="post" action="${pageContext.request.contextPath }/patientAddMethod">
            <input type="hidden" name="method" value="add">
            <!--div的class 为error是验证错误，ok是验证成功-->
            <div>
                <label for="patientName">病人名字：</label>
                <input type="text" name="patientName" id="patientName" value="">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>
            <div>
                <label for="patientAge">病人年龄：</label>
                <input type="text" name="patientAge" id="patientAge" value="">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>
            <div>
                <label for="patientSex">病人性别：</label>
                <select name="patientSex" id="patientSex">
                    <option value="男" selected="selected">男</option>
                    <option value="女">女</option>
                </select>
            </div>
            <div>
                <label for="patientTel">病人电话：</label>
                <input type="text" name="patientTel" id="patientTel" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="patientAddress">病人住址：</label>
                <input type="text" name="patientAddress" id="patientAddress" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="appDate">预约日期：</label>
                <input type="text" Class="Wdate" id="appDate" name="appDate" value=""
                       readonly="readonly" onclick="J.calendar.get({id:'appDate'});">
                <font color="red"></font>
            </div>

            <div>
                <label for="patientHistory">病人往史：</label>
                <input type="text" name="patientHistory" id="patientHistory"  value="">
            </div>
            <div class="providerAddBtn">
                <input type="button" name="add" id="add" value="保存" >
                <a href="patientList"><input type="button" id="back" name="back" value="返回" ></a>
            </div>
        </form>
    </div>
</div>
</section>
<script src="../../../statics/js/patientAdd.js" type="text/javascript"></script>
<%@include file="../common/foot.jsp" %>