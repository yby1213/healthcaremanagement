<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>病人信息管理 >> 病人信息查看页面</span>
    </div>
    <div class="providerView">
        <p><strong>病人编号：</strong><span>${patient.patientNo }</span></p>
        <p><strong>病人姓名：</strong><span>${patient.patientName }</span></p>
        <p><strong>病人性别：</strong>
            <span>
            		<c:if test="${patient.patientSex.equals('男')}">男</c:if>
					<c:if test="${patient.patientSex.equals('女')}">女</c:if>
            </span>
        </p>
        <p><strong>病人年龄：</strong><span>${patient.patientAge }</span></p>
        <p><strong>病人电话：</strong><span>${patient.patientTel }</span></p>
        <p><strong>病人住址：</strong><span>${patient.patientAddress }</span></p>
        <p><strong>预约时间：</strong><span>${patient.appDate }</span></p>
        <p><strong>病往史：</strong><a href="#" class="fancy-button bg-gradient1" id="historyBtn" ><span><i class="fa fa-wheelchair-alt"></i>点此查看病史</span></a></p>
        <div class="providerAddBtn">
            <a href="patientList"><input type="button" id="back" name="back" value="返回" ></a>
        </div>
        <div class="right_Info">
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="25%">历史编号</th>
                    <th width="25%">病人姓名</th>
                    <th width="25%">看病日期</th>
                    <th width="25%">当时病症</th>
                </tr>
                <tbody>
                <tr>
                    <c:forEach var = "history" items="${historyList}" varStatus="status">
                    <tr>
                        <td><span>${history.historyNo }</span></td>
                        <td><span>${history.patientName }</span></td>
                        <td><span>${history.historyDate }</span></td>
                        <td><span>${history.historyDiagnosis }</span></td>
                    </tr>
                    </c:forEach>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</section>
<script type="application/javascript" src="../../../statics/js/patientInfo.js"></script>
<%@include file="../common/foot.jsp" %>