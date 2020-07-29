<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>用户管理页面 >> 药品添加页面</span>
    </div>
    <div class="providerAdd">
        <form id="Form" name="medicineForm" method="post" enctype="multipart/form-data"  action="medicineAddSave">
            <input type="hidden" name="method" value="add">
            <!--div的class 为error是验证错误，ok是验证成功-->
            <%--<div>
                <label for="medicineNo">药品编号：</label>
                <input type="text" name="medicineName" id="medicineNo" value="">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>--%>
            <div>
                <label for="medicineName">药品名称：</label>
                <input type="text" name="medicineName" id="medicineName" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="medicineDisease">药品作用：</label>
                <input type="text" name="medicineDisease" id="medicineDisease" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="medicineDoses">服用剂量：</label>
                <input type="text" name="medicineDoses" id="medicineDoses" value="">
                <font color="red"></font>
            </div>

            <div class="providerAddBtn">
                <input type="button" name="add" id="add" value="保存" >
                <a href="medicineList"><input type="button" id="back" name="back" value="返回" ></a>
            </div>
        </form>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/medicineAdd.js"></script>