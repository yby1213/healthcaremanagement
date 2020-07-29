<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>医生中心</title>
</head>
<body>
<div class="right">
	<div class="location">
		<strong>你现在所在的位置是:</strong>
		<span>挂号信息管理页面</span>
	</div>
	<div class="search">
		<form method="get" action="#">
			<input name="method" value="query" class="input-text" type="hidden">
			<span>病人名或医生名：</span>
			<input name="queryname" class="input-text"	type="text" value="">
			<input type="hidden" name="pageIndex" value="1"/>
			<input	value="查 询" type="submit" id="searchbutton">
			<input	value="只看自己" type="button" id="searchself">
			<a href="registrationAdd" >添加挂号表</a>
		</form>
	</div>
	<!--用户-->
	<table class="providerTable" cellpadding="0" cellspacing="0">
		<tr class="firstTr">
			<th width="18%">挂号编码</th>
			<th width="18%">病人姓名</th>
			<th width="18%">所挂诊室</th>
			<th width="21%">所挂医生</th>
			<th width="25%">操作</th>
		</tr>
		<tbody>
		<tr>
			<c:forEach var = "registration" items="${registrationList}" varStatus="status">
			<tr>
				<td><span>${registration.regNo }</span></td>
				<td><span>${registration.regPatientName }</span></td>
				<td><span>${registration.regClinicName }</span></td>
				<td><span>${registration.regDoctorName }</span></td>
				<td>
					<a class="registrationInfo" href="javascript:;" regNo=${registration.regNo } regPatientName=${registration.regPatientName }><img src="../../statics/img/read.png"></a>
					<a class="registrationMod" href="javascript:;" regNo=${registration.regNo } regPatientName=${registration.regPatientName }><img src="../../statics/img/xiugai.png"></a>
					<a class="registrationDel" href="javascript:;" regNo=${registration.regNo } regPatientName=${registration.regPatientName }><img src="../../statics/img/schu.png"></a>
					<a class="historyAdd" href="javascript:;" patientName=${registration.regPatientName } historyDate="${registration.regDate}" historyDiagnosis=${registration.diagnosis}><img src="../../statics/img/addhistory.png"></a>
				</td>
			</tr>
			</c:forEach>
		</tr>
		</tbody>
	</table>
	<input type="hidden" id="totalPageCount" value=""/>
	<c:import url="../rollpage.jsp">
		<c:param name="totalCount" value="${pages.totalCount}"/>
		<c:param name="currentPageNo" value="${pages.currentPageNo}"/>
		<c:param name="totalPageCount" value="${pages.totalPageCount}"/>
	</c:import>
</div>
</section>
<div class="zhezhao"></div>
<div class="remove" id="removeUse">
	<div class="removerChid">
		<h2>提示</h2>
		<div class="removeMain">
			<p>你确定要删除该用户吗？</p>
			<a href="#" id="yes">确定</a>
			<a href="#" id="no">取消</a>
		</div>
	</div>
</div>
<script src="../../../statics/js/registrationList.js" type="text/javascript"></script>
<%@include file="../common/foot.jsp" %>
