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
		<span>诊室信息管理页面</span>
	</div>
	<div class="search">
		<form method="get" action="#">
			<input name="method" value="query" class="input-text" type="hidden">
			<span>诊室名：</span>
			<input name="queryname" class="input-text"	type="text" value="">
			<input type="hidden" name="pageIndex" value="1"/>
			<input	value="查 询" type="submit" id="searchbutton">
			<a href="clinicAdd" onclick="clinicAdd()">添加诊室</a>
		</form>
	</div>
	<!--用户-->
	<table class="providerTable" cellpadding="0" cellspacing="0">
		<tr class="firstTr">
			<th width="25%">诊室编码</th>
			<th width="25%">诊室名</th>
			<th width="25%">诊室位置</th>
			<th width="25%">操作</th>
		</tr>
		<tbody>
		<tr>
			<c:forEach var="clinic" items="${clinicList}" varStatus="status">
			<tr>
				<td>
					<span>${clinic.clinicNo }</span>
				</td>
				<td>
					<span>${clinic.clinicName }</span>
				</td>
				<td>
					<span>${clinic.clinicAddress}</span>
				</td>
				<td>
					<span><a class="clinicInfo" href="javascript:;" clinicNo=${clinic.clinicNo } clinicName=${clinic.clinicName }><img src="../../statics/img/read.png" alt="查看" title="查看"/></a></span>
					<span><a class="clinicMod" href="javascript:;" clinicNo=${clinic.clinicNo } clinicName=${clinic.clinicName }><img src="../../statics/img/xiugai.png" alt="修改" title="修改"/></a></span>
					<span><a class="clinicDel" href="javascript:;" clinicNo=${clinic.clinicNo } clinicName=${clinic.clinicName }><img src="../../statics/img/schu.png" alt="删除" title="删除"/></a></span>
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
<script src="../../../statics/js/clinicList.js" type="text/javascript"></script>
<%@include file="../common/foot.jsp" %>

