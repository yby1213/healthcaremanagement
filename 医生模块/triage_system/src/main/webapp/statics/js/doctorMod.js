var doctorName = null;
var doctorSex = null;
var doctorTel = null;
var doctorBel = null;
var doctorPassword = null;
var modBtn = null;
$(function() {
    doctorName = $("#doctorName");
    doctorSex = $("#doctorSex");
    doctorTel = $("#doctorTel");
    doctorBel = $("#doctorBel");
    doctorPassword = $("#doctorPassword");
    modBtn = $("#mod");

    doctorName.next().html("*");
    doctorSex.next().html("*");
    doctorTel.next().html("*");
    doctorBel.next().html("*");
    doctorPassword.next().html("*");
    var reg1=/^[\u4e00-\u9fa5]+$/;
    var reg=/^1[3456789]\d{9}$/;
    doctorName.bind("focus", function () {
        validateTip(doctorName.next(), {"color": "#666666"}, "* 此处为医生名称", false);
    }).bind("blur", function () {
        if (doctorName.val() != null && doctorName.val() != '') {
            if (!reg1.test(doctorName.val())) {
                validateTip(doctorName.next(), {"color": "red"}, "*请输入中文", false);
            }else{
            validateTip(doctorName.next(), {"color": "green"}, "*", true);
            }
        } else {
            validateTip(doctorName.next(), {"color": "red"},  "** 医生名字不可为空", false);
        }
    });

    doctorSex.bind("focus", function () {
        validateTip(doctorSex.next(), {"color": "#666666"}, "* 此处为医生性别", false);
    }).bind("blur", function () {
        if (doctorSex.val() != null && doctorSex.val() != '' ) {
            validateTip(doctorSex.next(), {"color": "green"}, "*", true);
        } else {
            validateTip(doctorSex.next(), {"color": "red"},  "** 医生性别不可为空", false);
        }
    });

    doctorTel.bind("focus", function () {
        validateTip(doctorTel.next(), {"color": "#666666"}, "* 此处为医生电话", false);
    }).bind("blur", function () {
        if (doctorTel.val() != null && doctorTel.val() != '' ) {
            if (!reg.test(doctorTel.val())) {
                validateTip(doctorTel.next(), {"color": "red"}, "*请输入正确的电话号码", false);
            }else {
                validateTip(doctorTel.next(), {"color": "green"}, "*", true);
            }
        } else {
            validateTip(doctorTel.next(), {"color": "red"},  "** 医生电话不可为空", false);
        }
    });
    doctorBel.bind("focus", function () {
        validateTip(doctorBel.next(), {"color": "#666666"}, "* 此处为医生隶属诊室", false);
    }).bind("blur", function () {
        if (doctorBel.val() != null && doctorBel.val() != '' ) {
            validateTip(doctorBel.next(), {"color": "green"}, "*", true);
        } else {
            validateTip(doctorBel.next(), {"color": "red"},  "** 医生隶属诊室不可为空", false);
        }
    });
    doctorPassword.bind("focus", function () {
        validateTip(doctorPassword.next(), {"color": "#666666"}, "* 此处为医生登录密码", false);
    }).bind("blur", function () {
        if (doctorPassword.val() != null && doctorPassword.val() != '' ) {
            validateTip(doctorPassword.next(), {"color": "green"}, "*", true);
        } else {
            validateTip(doctorPassword.next(), {"color": "red"},  "** 医生登录密码不可为空", false);
        }
    });
    modBtn.bind("click",function(){
        if(confirm("是否确认提交数据")){
            $("#Form").submit();
        }
    });
});