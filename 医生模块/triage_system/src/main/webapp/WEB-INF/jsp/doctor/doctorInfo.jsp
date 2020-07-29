<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>医生信息管理 >> 医生信息查看页面</span>
    </div>
    <div class="providerView">
        <p><strong>医生编号：</strong><span>${doctor.doctorNo }</span></p>
        <p><strong>医生姓名：</strong><span>${doctor.doctorName }</span></p>
        <p><strong>医生性别：</strong>
            <span>
            		<c:if test="${doctor.doctorSex.equals('男')}">男</c:if>
					<c:if test="${doctor.doctorSex.equals('女')}">女</c:if>
            </span>
        </p>
        <p><strong>联系电话：</strong><span>${doctor.doctorTel }</span></p>
        <p><strong>隶属诊室：</strong><span>${doctor.doctorBel }</span></p>
        <div class="providerAddBtn">
            <a href="doctorList"><input type="button" id="back" name="back" value="返回" ></a>
        </div>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>