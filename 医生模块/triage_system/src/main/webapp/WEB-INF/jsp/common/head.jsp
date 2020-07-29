<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>医院分诊系统</title>
    <link type="text/css" rel="stylesheet" href="../../statics/css/public.css" />
    <link type="text/css" rel="stylesheet" href="../../../statics/css/deleteBox.css">
	<link rel="stylesheet" href="../../statics/css/bootstrap.min.css" type="text/css" />
    <script src="../../statics/js/jquery-2.1.1.min.js" type="text/javascript"></script>
</head>
<body>
<!--头部-->
    <header class="publicHeader">
        <h1>医院分诊系统</h1>
        <div class="publicHeaderR">
            <p><span>您好！</span><span style="color: #01AAED" id="selfName" selfName=${userSession.doctorName }> ${userSession.doctorName } </span> 医生</p>
            <a href="login">退出</a>
        </div>
    </header>
<!--时间-->
    <section class="publicTime">
        <span id="time">2015年1月1日 11:11  星期一</span>
    </section>
 <!--主体内容-->
 <section class="publicMian ">
     <div class="left">
         <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
         <nav>
             <ul class="list">
              <li ><a href="doctorList">医生信息</a></li>
              <li><a href="patientList">病人信息</a></li>
              <li><a href="clinicList">诊室信息</a></li>
              <li><a href="registrationList">挂号信息</a></li>
              <li><a href="medicineList">药品信息</a></li>
             </ul>
         </nav>
     </div>
     <input type="hidden" id="path" name="path" value=""/>
     <input type="hidden" id="referer" name="referer" value=""/>