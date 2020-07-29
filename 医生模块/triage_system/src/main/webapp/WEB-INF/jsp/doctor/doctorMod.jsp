<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		 <div class="right">
             <div class="location">
                 <strong>你现在所在的位置是:</strong>
                 <span>医生信息管理 >> 医生信息修改页面</span>
             </div>
        <div class="providerAdd">
        <form id="Form" name="docForm" method="post" action="${pageContext.request.contextPath }/doctorModMethod">
			<input type="hidden" name="method" value="modifyexe">
			<input type="hidden" name="doctorNo" value="${doctor.doctorNo}"/>
			 <div>
                    <label for="doctorName">医生姓名：</label>
                    <input type="text" name="doctorName" id="doctorName" value="${doctor.doctorName}">
                    <font color="red">*</font>
             </div>
			 <div>
                    <label for="doctorSex">医生性别：</label>
                    <select name="doctorSex" id="doctorSex">
                        <c:choose>
                            <c:when test="${doctor.doctorSex.equals('男')}">
                                <option value="男" selected="selected">男</option>
                                <option value="女">女</option>
                            </c:when>
                            <c:otherwise>
                                <option value="男">男</option>
                                <option value="女" selected="selected">女</option>
                            </c:otherwise>
                        </c:choose>
					 </select>
             </div>
			
		       <div>
                    <label for="doctorTel">医生电话：</label>
                    <input type="text" name="doctorTel" id="doctorTel" value="${doctor.doctorTel}">
               </div>
                <div>
                    <label for="doctorBel">隶属诊室：</label>
                    <input type="text" name="doctorBel" id="doctorBel" value="${doctor.doctorBel}">
                </div>
				<div>
                    <label for="doctorPassword">登录密码：</label>
					<input type="password" name="doctorPassword" id="doctorPassword" value="${doctor.doctorPassword}">
                </div>
			 <div class="doctorModBtn">
                    <input type="button" name="mod" id="mod" value="保存" />
                    <a href="doctorList"><input type="button" id="back" name="back" value="返回" ></a>
                </div>
            </form>
        </div>
    </div>
</section>
<%@include file="../common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/doctorMod.js"></script>
