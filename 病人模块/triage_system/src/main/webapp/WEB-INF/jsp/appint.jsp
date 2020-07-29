<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html>

<head>
    <meta charset="utf-8">
    <title>第二组挂号首页</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-3.5.1.js" language="JavaScript"></script>
    <link href="${pageContext.request.contextPath }/statics/css/bootstrap.css" rel='stylesheet' type='text/css'/>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath }/statics/js/bootstrap.min.js"></script>


    <!-- Custom Theme files -->
    <link href="${pageContext.request.contextPath }/statics/css/style.css" rel='stylesheet' type='text/css'/>
    <link href="${pageContext.request.contextPath }/statics/css/style2.css" rel='stylesheet' type='text/css'/>
    <!-- Custom Theme files -->
    <script src="${pageContext.request.contextPath }/statics/js/runnews.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!--webfont-->

    <script src="${pageContext.request.contextPath }/statics/js/jquery.easydropdown.js"></script>
    <style type="text/css">
        .logo h1{
            font-weight: bolder;
            margin-left: 10px;
            margin-bottom: 10px;
        }
        .dropdown{
            background: -webkit-linear-gradient(right,#f2f5d0,#f9957f);
            background: linear-gradient(right,#f2f5d0,#f9957f);
            border: none;
            width: 200px;
            height: 40px;
            color: white;
            position: absolute;
            top:-200px;
        }
        .contact-left{
            padding: 20px;
            border:1px solid #CCEFF5;
            background-color:#FAFCFD;
        }
        .contact-right{
            padding-top: 50px;
            padding: 20px;
            border:1px solid #CCEFF5;
            background-color:#FAFCFD;
        }
        #form_sub{
            background: #1AAB8A;
            color: #fff;
            border: none;
            position: relative;
            height: 60px;
            font-size: 1.6em;
            padding: 0 2em;
            cursor: pointer;
            transition: 800ms ease all;
            outline: none;
        }
        #form_sub:hover{
            background:#1AAB8A;
            color: black;
            font-weight: bold;
            border-top: 3px solid darkolivegreen;
            border-right: 2px solid darkolivegreen;
            border-left: 2px solid darkolivegreen;
            border-radius: 3px;
            position: relative;
            top:1px;
        }
    </style>
    <script type="application/javascript">
        function quarry(){
            window.location.href = "quarry.html";
        }
    </script>
</head>

<body>
<div class="header">
    <div class="header_top">
        <div class="container-fluid">
            <div class="logo">
                <h1><a href="#" id="logo">分诊系统预约挂号</a></h1>
            </div>
            <div id="return_first">
                <a href="${pageContext.request.contextPath }/login.html">返回首页</a>
            </div>

            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse"
                            data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container-fluid -->
            </nav>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="login_bg"></div>
    <div class="login_box">
        <div class="container">
            <div class="contact">
                <div class="col-md-4">
                    <div class="contact-left">
                        <h2>预约信息</h2>
                        <div id="demo" style="OVERFLOW: hidden; height: 300px;">
                            <div id="marquePic1">
                                <ul id="registrationList">
                                </ul>
                            </div>
                            <div id="marquePic2" valign="top">
                            </div>
                        </div>


                    </div>
                </div>
                <div class="col-md-8">
                    <div class="contact-right">
                        <h2>挂号信息</h2>
                        <div class="contact-form">
                            <form id="patientForm" name="patientForm" enctype="multipart/form-data" method="post"
                                  action="${pageContext.request.contextPath }/registrationAddSave">
                                <input type="text" id="userName" name="regPatientName" class="textbox" value="病人名字:" onfocus="this.value = '';"
                                       onblur="if (this.value == '') {this.value = '名字';}"><span id="infoName"></span>
                                就诊时间：
                                <input type="datetime-local" name="regDate" id="regDate" cregDatelass="textbox">
                                <br/>
                                <br/>

                                <select name="regClinicName" id="doctorList" class="form-control">
                                   <c:if test="${doctorList!=null}">
                                        <c:forEach var="name" items="${doctorList}">
                                            <option
                                                value="${name.doctorBel}">${name.doctorBel}
                                            </option>
                                        </c:forEach>
                                    </c:if>

                                </select>
                                <br/>
                                <select name="regDoctorName"  id="clinicDocList"  class="form-control">
                                    <option value="">请选择对应的医生</option>
                                </select>

                                <textarea name="regPatientSymptoms" value="请输入症状" onfocus="this.value = '';"
                                          onblur="if (this.value == '') {this.value = '请输入症状';}">请输入症状</textarea>
                                <input type="submit" id="form_sub" value="预约" >
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <div class="footer">
            <div class="container">
                <div class="col-md-6">
                    <input type="button" class="dropdown" tabindex="10" value="查询诊断信息>>" onclick="quarry()"  />
                </div>
                <div class="col-md-6 footer_right">
                    <p>Quick Contact</p>
                    <span class="email"><a href="malito:mail@demolink.org">TWO.com</a></span>
                    <ul class="footer_social">

                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>