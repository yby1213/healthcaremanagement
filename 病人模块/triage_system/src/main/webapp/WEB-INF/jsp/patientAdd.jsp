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
    <script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }

        $(function () {
        })

        function openDialog() {
            document.getElementById('light').style.display = 'block';
            document.getElementById('fade').style.display = 'block'
        }

        function closeDialog() {
            document.getElementById('light').style.display = 'none';
            document.getElementById('fade').style.display = 'none'
        }


    </script>
    <!--webfont-->

    <script src="${pageContext.request.contextPath }/statics/js/jquery.easydropdown.js"></script>
    <style type="text/css">
        .logo h1{
            font-weight: bolder;
            margin-left: 10px;
            margin-bottom: 10px;
        }
        .contact-left{
            padding: 20px;
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
                        <h2><img src="../../statics/images/15.jpg" style="width: 200px;height: 150px;"/></h2>
                        <div id="demo" style="OVERFLOW: hidden; height: 300px;">
                            <div id="marquePic">

                                    首次预约请填写个人信息

                            </div>
                            <div id="marquePic2" valign="top">
                            </div>
                        </div>
                        <script type="text/javascript">
                            //纵向滚动 需要设置div的高度
                            var speed = 30
                            marquePic2.innerHTML = marquePic1.innerHTML

                            function Marquee() {
                                if (demo.scrollTop >= marquePic1.scrollHeight) {
                                    demo.scrollTop = 0
                                } else {
                                    demo.scrollTop++
                                }
                            }

                            var MyMar = setInterval(Marquee, speed)
                            demo.onmouseover = function () {
                                clearInterval(MyMar)
                            }
                            demo.onmouseout = function () {
                                MyMar = setInterval(Marquee, speed)
                            }
                        </script>

                    </div>
                </div>
                <div class="col-md-8">
                    <div class="contact-right">
                        <h2>注册病人表</h2>
                        <div class="contact-form">
                            <form id="patForm" name="patientForm" enctype="multipart/form-data" method="post"
                                  action="${pageContext.request.contextPath }/patientAddSave">
                                <input type="text" id="userName" name="patientName" class="textbox" value="您的姓名" onfocus="this.value = '';"
                                       onblur="if (this.value == '') {this.value = '您的姓名';}"><span id="infoName"></span>

                                <select name="patientSex" id="patientSex" class="form-control">
                                    <option >--性别--</option>
                                    <option >男</option>
                                    <option >女</option>
                                </select>
                                <input type="text" id="patientAge" name="patientAge" class="textbox" value="您的年龄" onfocus="this.value = '';"
                                       onblur="if (this.value == '') {this.value = '您的年龄';}"><span id="infoName"></span>
                                <input type="text" id="patientAddress" name="patientAddress" class="textbox" value="您的住址" onfocus="this.value = '';"
                                       onblur="if (this.value == '') {this.value = '您的地址';}"><span id="infoName"></span>

                                <input type="text" id="phone" name="patientTel" class="textbox" value="您的电话:" onfocus="this.value = '';"
                                       onblur="if (this.value == '') {this.value = '您的电话';}"><span id="infoPhone"></span>
                                <%--<input type="text" id="adress" name="patientAddress" class="textbox" value="家庭住址:" onfocus="this.value = '';"
                                       onblur="if (this.value == '') {this.value = '地址';}"> --%>
                                预约时间：
                                <input type="date" name="appDate" class="textbox">
                                <br/>
                                <br/>
                                <%--<select name="patientSex" class="form-control">
                                    <option>--性别--</option>
                                    <option>男</option>
                                    <option>女</option>
                                </select>
                                <br/>--%>
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

                </div>
                <div class="col-md-6 footer_right">
                    <p>Quick Contact</p>
                    <span class="email"><a href="malito:mail@demolink.org">TWO.COM</a></span>
                    <ul class="footer_social">

                    </ul>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>