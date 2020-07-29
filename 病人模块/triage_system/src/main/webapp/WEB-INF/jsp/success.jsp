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



        function closeDialog() {
            document.getElementById('light').style.display = 'none';
            document.getElementById('fade').style.display = 'none'
        }


    </script>
    <!--webfont-->

    <script src="${pageContext.request.contextPath }/statics/js/jquery.easydropdown.js"></script>
</head>

<body>
<div class="header">
    <div class="header_top">
        <div class="container-fluid">
            <div class="logo">
                <h1><a href="index.jsp" id="logo">某某医院预约挂号</a></h1>
            </div>
            <div id="return_first">
                返回首页
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
                        <h2>患者信息</h2>
                        <div class="contact-form">
                            <form id="patientForm" name="patientForm" enctype="multipart/form-data" method="post"
                                  action="${pageContext.request.contextPath }/patientAddSave">
                            <input type="text" id="userName" name="patientName" class="textbox" value="名字:" onfocus="this.value = '';"
                                   onblur="if (this.value == '') {this.value = '名字';}"><span id="infoName"></span>
                            <input type="text" id="phone" name="patientTel" class="textbox" value="电话:" onfocus="this.value = '';"
                                   onblur="if (this.value == '') {this.value = '电话';}"><span id="infoPhone"></span>
                            <input type="text" id="adress" name="patientAddress" class="textbox" value="家庭住址:" onfocus="this.value = '';"
                                   onblur="if (this.value == '') {this.value = '地址';}"> 预约时间：

                            <input type="datetime-local" class="textbox">
                            <br/>
                            <br/>
                            <select name="patientSex" class="form-control">
                                <option>--性别--</option>
                                <option>男</option>
                                <option>女</option>
                            </select>
                            <br/>
                            <select name="departmt" class="form-control">

                            </select>
                            <br/>
                            <select name="doctorName" class="form-control">
                                <option>--请选择医生--</option>
                                <option>张三</option>

                            </select>

                            <textarea value="请输入病往史以及过敏情况" onfocus="this.value = '';"
                                      onblur="if (this.value == '') {this.value = '请输入病往史以及过敏情况';}">请输入病往史以及过敏情况</textarea>
                            <input type="submit" id="form_sub" value="预约" >
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <div id="light" class="white_content">
            <div>
                <img id="success" src="../../statics/images/success.png">
            </div>
            <div>
                <h2 id="info_suc">&nbsp;&nbsp;恭喜你
                    <p>预约成功</p></h2>
            </div>

            <a href="${pageContext.request.contextPath }/registrationAdd.html">点这里关闭本窗口</a>
        </div>
        <div id="fade" class="black_overlay"></div>
        <div class="footer">
            <div class="container">
                <div class="col-md-6">
                    <select class="dropdown" tabindex="10" data-settings='{"wrapperClass":"metro"}'>
                        <option value="0">Dubai</option>
                        <option value="1">tempor</option>
                        <option value="2">congue</option>
                        <option value="3">mazim</option>
                        <option value="4">mutationem</option>
                        <option value="5">hendrerit</option>
                        <option value="5"></option>
                        <option value="5"></option>
                    </select>

                </div>
                <div class="col-md-6 footer_right">
                    <p>Quick Contact</p>
                    <span class="email"><a href="malito:mail@demolink.org">mail(at)cancer.com</a></span>
                    <ul class="footer_social">

                    </ul>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>