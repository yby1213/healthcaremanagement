<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>分诊系统患者查询医生就诊信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath }/statics/js/jquery-1.7.2.js"></script>
    <script src="${pageContext.request.contextPath }/statics/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath }/statics/js/vue.js"></script>
    <script src="${pageContext.request.contextPath }/statics/js/runnews.js"></script>
    <link href="${pageContext.request.contextPath }/statics/css/style2.css" rel='stylesheet' type='text/css'/>
    <script>
        window.onload=function(){
            new Vue({
                el:'#box',
                data:{
                    myData:[],
                    username:'',
                    age:'',
                    nowIndex:-100
                },
                methods:{
                    add:function(){
                        this.myData.push({
                            name:this.username,
                            age:this.age
                        });

                        this.username='';
                        this.age='';
                    },
                    deleteMsg:function(n){
                        if(n==-2){
                            this.myData=[];
                        }else{
                            this.myData.splice(n,1);
                        }
                    }
                }
            });
        };
    </script>
    <style type="text/css">
        .logo h1{
            font-weight: bolder;
            margin-left: 10px;
            margin-bottom: 10px;
        }
        body{
            background-color: rgba(240,230,140,0.2);
        }
        .container{
            margin: 0px auto;
            background-color: rgba(0,0,0,0.1);
            /* 实现垂直居中 距顶部高度  也可以写成 calc((100vh - 60vh)/2) */
            margin-top: 20vh;
        }
        .form-group:last-child{
            text-align: center;
        }
    </style>
</head>
<body>

    <div class="container" id="box">
            <form role="form"action="${pageContext.request.contextPath }/getDia">
                <div class="form-group"><label for="username">用户名:</label>
                    <input type="text" name="regPatientName" id="userName" class="form-control" placeholder="输入用户名" v-model="username">
                    <span id="infoName"></span>
                </div>
                <div class="form-group">
                    <label for="phone">手机号:</label>
                    <input type="text" name="patientTel" id="phone" class="form-control" placeholder="输入手机号" v-model="age">
                    <span id="infoPhone"></span>
                </div>
            <div class="form-group">
                <input type="submit" value="查看" class="btn btn-primary">
                <input type="reset" value="打印" class="btn btn-danger" style="margin-left:50px">
            </div>
        </form>
        <hr>
        <table class="table table-bordered table-hover">
            <caption class="h3 text-info">患者诊断信息</caption>

            <tbody>

                <c:forEach var="dia" items="${diagnosisList}" varStatus="status">
                    <c:if test="${dia.diagnosis!=null }">
                <tr>

                    <td><span class="ch"><strong>姓名是：</strong></span>${dia.regPatientName}
                    <span class="table_show"><span class="ch"><strong>门诊：</strong></span>${dia.regClinicName}</span>
                        <span class="table_show"><span class="ch"><strong>医生：</strong></span>${dia.regDoctorName}</span></td>
                </tr>

                        <tr>

                    <td colspan="4">
                        <span class="ch"><strong>就诊情况:</strong></span><span>${dia.diagnosis }</span>
                </td>
                </tr>
                        <tr></tr>
                        <tr></tr>
                        <tr></tr>

                    </c:if>



                </c:forEach>

            </tbody>

        </table>

    </div>
</body>
</html>