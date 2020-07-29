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
        <span>医生信息管理页面</span>
    </div>
    <div class="search">
        <form method="get" action="#">
            <input name="method" value="query" class="input-text" type="hidden">
            <span>医生名：</span>
            <input name="queryname" class="input-text"	type="text" value="">
            <input type="hidden" name="pageIndex" value="1"/>
            <input	value="查 询" type="submit" id="searchbutton">
            <a href="doctorAdd" onclick="doctorAdd()">添加医生</a>
        </form>
    </div>
    <!--用户-->
    <table class="providerTable" cellpadding="0" cellspacing="0">
        <tr class="firstTr">
            <th width="25%">医生编码</th>
            <th width="25%">医生姓名</th>
            <th width="25%">隶属诊室</th>
            <th width="25%">操作</th>
        </tr>
        <tbody>
        <tr>
            <c:forEach var = "doctor" items="${doctorList}" varStatus="status">
            <tr>
                <td><span>${doctor.doctorNo }</span></td>
                <td><span>${doctor.doctorName }</span></td>
                <td><span>${doctor.doctorBel }</span></td>
                <td>
                    <a class="doctorInfo" href="javascript:;" doctorNo=${doctor.doctorNo } doctorName=${doctor.doctorName }><img src="../../statics/img/read.png"></a>
                    <a class="doctorMod" href="javascript:;" doctorNo=${doctor.doctorNo } doctorName=${doctor.doctorName }><img src="../../statics/img/xiugai.png"></a>
                    <a class="doctorDel" href="javascript:;" doctorNo=${doctor.doctorNo } doctorName=${doctor.doctorName }><img src="../../statics/img/schu.png"></a>
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
<%@include file="../common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/doctorList.js"></script>
