var clinicName = null;
var clinicAddress = null;
var clinicDoc = null;
var clinicIntroduce = null;
var modBtn = null;
$(function() {
    clinicName = $("#clinicName");
    clinicAddress = $("#clinicAddress");
    clinicDoc = $("#clinicDoc");
    clinicIntroduce = $("#clinicIntroduce");
    modBtn = $("#mod");

    clinicName.next().html("*");
    clinicAddress.next().html("*");
    clinicDoc.next().html("*");
    var reg1=/^[\u4e00-\u9fa5]+$/;
    var reg=/^1[3456789]\d{9}$/;
    clinicName.bind("focus", function () {
        validateTip(clinicName.next(), {"color": "#666666"}, "* 此处为诊室名称", false);
    }).bind("blur", function () {
        if (clinicName.val() != null && clinicName.val() != '') {
            if (!reg1.test(clinicName.val())) {
                validateTip(clinicName.next(), {"color": "red"}, "*请输入中文", false);
            }else{
                validateTip(clinicName.next(), {"color": "green"}, "*", true);
            }
        } else {
            validateTip(clinicName.next(), {"color": "red"},  "** 诊室名字不可为空", false);
        }
    });

    clinicAddress.bind("focus", function () {
        validateTip(clinicAddress.next(), {"color": "#666666"}, "* 此处为诊室地址", false);
    }).bind("blur", function () {
        if (clinicAddress.val() != null && clinicAddress.val() != '' ) {
            if (!reg1.test(clinicAddress.val())) {
                validateTip(clinicAddress.next(), {"color": "red"}, "*请输入中文", false);
            }else {
                validateTip(clinicAddress.next(), {"color": "green"}, "*", true);
            }
        } else {
            validateTip(clinicAddress.next(), {"color": "red"},  "** 诊室地址不可为空", false);
        }
    });

    clinicDoc.bind("focus", function () {
        validateTip(clinicDoc.next(), {"color": "#666666"}, "* 此处为负责医生", false);
    }).bind("blur", function () {
        if (clinicDoc.val() != null && clinicDoc.val() != '' ) {
            if (!reg1.test(clinicDoc.val())) {
                validateTip(clinicDoc.next(), {"color": "red"}, "*请输入中文", false);
            }else {
                validateTip(clinicDoc.next(), {"color": "green"}, "*", true);
            }
        } else {
            validateTip(clinicDoc.next(), {"color": "red"},  "** 负责医生不可为空", false);
        }
    });
    modBtn.bind("click",function(){
        if(confirm("是否确认提交数据")){
            $("#Form").submit();
        }
    });
});