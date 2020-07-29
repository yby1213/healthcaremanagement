<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>挂号信息管理 >> 挂号信息查看页面</span>
    </div>
    <div class="providerView">
        <p><strong>挂号表编号：</strong><span>${registration.regNo }</span></p>
        <p><strong>病人名字：</strong><span>${registration.regPatientName }</span></p>
        <p><strong>病人症状：</strong><span>${registration.regPatientSymptoms }</span></p>
        <p><strong>挂的诊室：</strong><span>${registration.regClinicName }</span></p>
        <p><strong>挂的医生：</strong><span>${registration.regDoctorName }</span></p>
        <p><strong>前方剩余人数：</strong><span>${registration.remaining }</span></p>
        <p><strong>就诊日期：</strong><span>${registration.regDate }</span></p>
        <p><strong>诊治信息：</strong><span>${registration.diagnosis }</span></p>
        <div class="providerAddBtn">
            <a href="registrationList"><input type="button" id="back" name="back" value="返回" ></a>
        </div>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>