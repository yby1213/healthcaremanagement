<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../common/head.jsp"%>

<head>
	<meta charset="utf-8">
	<title>医生中心</title>
</head>

<div class="right">
	<div class="location">
		<strong>你现在所在的位置是:</strong>
		<span>药品管理页面</span>
	</div>
	<div class="search">
		<form method="get" action="#">
			<input name="method" value="query" class="input-text" type="hidden">
			<span>药品名：</span>
			<input name="medicineName" class="input-text"	type="text" value="${queryUserName }">
			<input type="hidden" name="pageIndex" value="1"/>
			<input	value="查 询" type="submit" id="searchbutton">
			<a href="medicineAdd" >添加药品</a>
		</form>
	</div>
	<!--用户-->
	<table class="providerTable" cellpadding="0" cellspacing="0">
		<tr class="firstTr">
			<th width="18%">药品编码</th>
			<th width="18%">药品名称</th>
			<th width="18%">药品作用</th>
			<th width="21%">服用剂量</th>
			<th width="25%">操作</th>
		</tr>
		<tbody>
		<tr>
			<c:forEach var="medicine" items="${medicineList }" varStatus="status">
			<tr>
				<td><span>${medicine.medicineNo }</span></td>
				<td><span>${medicine.medicineName }</span></td>
				<td><span>${medicine.medicineDisease}</span></td>
				<td><span>${medicine.medicineDoses}</span></td>
				<td>
					<span><a class="viewMedicine" href="javascript:;" medicineNo=${medicine.medicineNo } medicineName=${medicine.medicineName }><img src="${pageContext.request.contextPath }/statics/img/read.png" alt="查看" title="查看"/></a></span>
					<span><a class="modifyMedicine" href="javascript:;" medicineNo=${medicine.medicineNo } medicineName=${medicine.medicineName }><img src="${pageContext.request.contextPath }/statics/img/xiugai.png" alt="修改" title="修改"/></a></span>
					<span><a class="deleteMedicine" href="javascript:;" medicineNo=${medicine.medicineNo } medicineName=${medicine.medicineName }><img src="${pageContext.request.contextPath }/statics/img/schu.png" alt="删除" title="删除"/></a></span>
				</td>
			</tr>
			</c:forEach>
		</tr>
		</tbody>
	</table>
	<input type="hidden" id="totalPageCount" value="${totalPageCount}"/>
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
<%@include file="../common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/medicineList.js"></script>