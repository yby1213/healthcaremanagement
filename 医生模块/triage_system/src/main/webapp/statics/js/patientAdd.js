var patientName = null;
var patientAge = null;
var patientSex = null;
var patientTel = null;
var patientAddress = null;
var appDate = null;
var patientHistory = null;
var addBtn = null;
$(function() {
    patientName = $("#patientName");
    patientAge = $("#patientAge");
    patientSex = $("#patientSex");
    patientTel = $("#patientTel");
    patientAddress = $("#patientAddress");
    appDate = $("#appDate");
    patientHistory = $("#patientHistory");
    addBtn = $("#add");

    patientName.next().html("*");
    patientAge.next().html("*");
    patientTel.next().html("*");
    appDate.next().html("*");

    patientName.bind("focus", function () {
        validateTip(patientName.next(), {"color": "#666666"}, "* 此处为病人姓名", false);
    }).bind("blur", function () {
        if (patientName.val() != null && patientName.val() != '') {
            validateTip(patientName.next(), {"color": "green"}, "*", true);
        } else {
            validateTip(patientName.next(), {"color": "red"},  "** 病人姓名不可为空", false);
        }
    });

    patientAge.bind("focus", function () {
        validateTip(patientAge.next(), {"color": "#666666"}, "* 此处为病人年龄", false);
    }).bind("blur", function () {
        if (patientAge.val() != null && patientAge.val() != '' ) {
            validateTip(patientAge.next(), {"color": "green"}, "*", true);
        } else {
            validateTip(patientAge.next(), {"color": "red"},  "** 病人年龄不可为空", false);
        }
    });

    patientTel.bind("focus", function () {
        validateTip(patientTel.next(), {"color": "#666666"}, "* 此处为联系电话", false);
    }).bind("blur", function () {
        if (patientTel.val() != null && patientTel.val() != '' ) {
            validateTip(patientTel.next(), {"color": "green"}, "*", true);
        } else {
            validateTip(patientTel.next(), {"color": "red"},  "** 联系电话不可为空", false);
        }
    });

    appDate.bind("focus", function () {
        validateTip(appDate.next(), {"color": "#666666"}, "* 此处为预约日期", false);
    }).bind("blur", function () {
        if (appDate.val() != null && appDate.val() != '' ) {
            validateTip(appDate.next(), {"color": "green"}, "*", true);
        } else {
            validateTip(appDate.next(), {"color": "red"},  "** 预约日期不可为空", false);
        }
    });

    addBtn.bind("click",function(){
        if(patientName.attr("validateStatus") != "true"){
            patientName.blur();
        }else if(patientAge.attr("validateStatus") != "true"){
            patientAge.blur();
        }else if(patientTel.attr("validateStatus") != "true"){
            patientTel.blur();
        }else if(appDate.attr("validateStatus") != "true"){
            appDate.blur();
        }else{
            if(confirm("是否确认提交数据")){
                $("#Form").submit();
            }
        }
    });
});