<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
</script>
<style type="text/css">
	.page-bar{
		margin-left: 50px;
		font-size: 15px;
		font-weight: bolder;
	}
</style>
</head>
<body>
 		<div class="page-bar">
			<ul class="page-num-ul clearfix">
				<li>共有 <font color="#6495ed"> ${param.totalCount } </font> 条记录&nbsp;&nbsp; <font color="#6495ed">${param.currentPageNo }</font> / ${param.totalPageCount }页</li>
				<c:if test="${param.currentPageNo > 1}">
					<a href="javascript:page_nav(document.forms[0],1);">首页</a>
					<a href="javascript:page_nav(document.forms[0],${param.currentPageNo-1});">上一页</a>
				</c:if>
				<c:if test="${param.currentPageNo < param.totalPageCount }">
					<a href="javascript:page_nav(document.forms[0],${param.currentPageNo+1 });">下一页</a>
					<a href="javascript:page_nav(document.forms[0],${param.totalPageCount });">最后一页</a>
				</c:if>
				&nbsp;&nbsp;
			</ul>
		</div> 
</body>
<script type="text/javascript" src="../../statics/js/rollpage.js"></script>
</html>