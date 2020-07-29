<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>用户管理页面 >> 医生添加页面</span>
    </div>
    <div class="providerAdd">
        <form id="Form" name="docForm" method="post" enctype="multipart/form-data"  action="${pageContext.request.contextPath}/doctorAddMethod">
            <input type="hidden" name="method" value="add">
            <!--div的class 为error是验证错误，ok是验证成功-->
            <div>
                <label for="doctorName">医生名字：</label>
                <input type="text" name="doctorName" id="doctorName" value="">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>
            <div>
                <label for="doctorTel">联系电话：</label>
                <input type="text" name="doctorTel" id="doctorTel" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="doctorPassword">登录密码：</label>
                <input type="password" name="doctorPassword" id="doctorPassword" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="rdoctorPassword">确认密码：</label>
                <input type="password" name="rdoctorPassword" id="rdoctorPassword" value="">
                <font color="red"></font>
            </div>
            <div>
                <label >医生性别：</label>
                <select name="doctorSex" id="doctorSex">
                    <option value="男" selected="selected">男</option>
                    <option value="女">女</option>
                </select>
            </div>
            <div>
                <label for="doctorBel">隶属诊室：</label>
                <input type="text" name="doctorBel" id="doctorBel" value="">
                <font color="red"></font>
            </div>
            <div class="providerAddBtn">
                <input type="button" name="add" id="add" value="保存" >
                <a href="doctorList"><input type="button" id="back" name="back" value="返回" ></a>
            </div>
        </form>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/doctorAdd.js"></script>