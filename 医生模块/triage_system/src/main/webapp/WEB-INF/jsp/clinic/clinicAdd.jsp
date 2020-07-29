<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>用户管理页面 >> 诊室添加页面</span>
    </div>
    <div class="providerAdd">
        <form id="Form" name="cliForm" method="post" action="${pageContext.request.contextPath }/clinicAddMethod">
            <input type="hidden" name="method" value="add">
            <!--div的class 为error是验证错误，ok是验证成功-->
            <div>
                <label for="clinicName">诊室名称：</label>
                <input type="text" name="clinicName" id="clinicName" value="">
                <!-- 放置提示信息 -->
                <strong><font color="red"></font></strong>
            </div>
            <div>
                <label for="clinicAddress">诊室位置：</label>
                <input type="text" name="clinicAddress" id="clinicAddress" value="">
                <strong><font color="red"></font></strong>
            </div>
            <div>
                <label for="clinicDoc">负责医生：</label>
                <input type="text" name="clinicDoc" id="clinicDoc" value="">
                <strong><font color="red"></font></strong>
            </div>
            <div>
                <label for="clinicIntroduce">诊室介绍：</label>
                <input type="text" name="clinicIntroduce" id="clinicIntroduce" value="">
                <strong><font color="red"></font></strong>
            </div>
            <div class="providerAddBtn">
                <input type="button" name="add" id="add" value="保存" >
                <a href="clinicList"><input type="button" id="back" name="back" value="返回" ></a>
            </div>
        </form>
    </div>
</div>
</section>
<script src="../../../statics/js/clinicAdd.js" type="text/javascript"></script>
<%@include file="../common/foot.jsp" %>