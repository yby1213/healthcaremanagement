<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>诊室信息管理 >> 诊室信息查看页面</span>
    </div>
    <div class="providerView">
        <p><strong>诊室编号：</strong><span>${clinic.clinicNo }</span></p>
        <p><strong>诊室名称：</strong><span>${clinic.clinicName }</span></p>
        <p><strong>诊室位置：</strong><span>${clinic.clinicAddress }</span></p>
        <p><strong>负责医生：</strong><span>${clinic.clinicDoc }</span></p>
        <p><strong>诊室介绍：</strong><span>${clinic.clinicIntroduce }</span></p>
        <div class="providerAddBtn">
            <a href="clinicList"><input type="button" id="back" name="back" value="返回" ></a>
        </div>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>