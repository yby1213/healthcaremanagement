$(function(){
	var reg1=/^[\u4e00-\u9fa5]+$/;
	var reg=/^1[3456789]\d{9}$/;
	var flag=false;
	$("#userName").blur(function(){
		if(!reg1.test($("#userName").val())){
			$("#infoName").html("请输入中文");
			flag=false;
		}else{
			$("#infoName").html("");
			flag=true;
		}
	});
	$("#phone").blur(function(){
		if(!reg.test($("#phone").val())){
			$("#infoPhone").html("电话号码不正确!");
			flag=false;
		}else{
			$("#infoPhone").html("");
			flag=true;
		}
	});

    registrationList = $("#registrationList");
    $.ajax({
        type:"GET",//请求类型
        url:"/getRegistrationList",//请求的url
        data:{},//请求参数
        dataType:"json",//ajax接口（请求url）返回的数据类型
        success:function(data){//data：返回数据（json对象）
            if(data != null){
                registrationList.html("");
                var options = "<li>李四预约了儿科</li>";
                for(var i = 0; i < data.length; i++){
                    options += "<li>"+data[i].regPatientName.substring(0,1)+"**预约了"+data[i].regClinicName+"</li>"
                }
                registrationList.html(options);
            }
        },
        error:function(data){//当访问时候，404，500 等非200的错误状态码
        }
    });

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



});

$(function(){
    $.ajax({
        url:"/getDoctorList",
        type:"post",
        success:function(data){
            var doctorListst = $("#doctorList")[0];
            for(var i = doctorList.options.length-1;i>0;i--){
                doctorList.remove(i);
            }
            $(data).each(function(){
                var option = new Option();
                option.value = this.doctorBel;
                option.text = this.doctorBel;
                doctorList.add(option);
            });
        },
        dataType:"json"
    });
});
$(function(){
    $("#doctorList").change(function(){
        $.ajax({
            url:"/getClinicDocList",
            data:{docName:$("#doctorList").val()},
            type:"post",
            success:function(data){
                var clinicDocList = $("#clinicDocList")[0];
                for(var i = clinicDocList.options.length-1;i>0;i--){
                    clinicDocList.remove(i);
                }
                $(data).each(function(){
                    var option = new Option();
                    option.value = this.doctorName;
                    option.text = this.doctorName;
                    clinicDocList.add(option);
                });
            },
            dataType:"json"
        });
    });
});
