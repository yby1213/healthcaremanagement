<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>挂号信息管理 >> 挂号信息查看页面</span>
    </div>
    <div class="providerView">
        <p><strong>药品编号：</strong><span>${medicine.medicineNo }</span></p>
        <p><strong>药品名字：</strong><span>${medicine.medicineName }</span></p>
        <p><strong>试用症状：</strong><span>${medicine.medicineDisease }</span></p>
        <p><strong>服用剂量：</strong><span>${medicine.medicineDoses }</span></p>

        <div class="providerAddBtn">
            <a href="medicineList"><input type="button" id="back" name="back" value="返回" ></a>
        </div>
    </div>
</div>
</section>
<%@include file="../common/foot.jsp" %>