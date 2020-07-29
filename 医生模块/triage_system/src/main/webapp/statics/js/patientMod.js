
$(function(){
	$("#save").click(function () {
		if(confirm("是否要提交数据？")){
			$("#Form").submit();
		}
	});
	patientName = $("#patientName");

	patientTel = $("#patientTel");

	patientName.next().html("*");

	patientTel.next().html("*");

	var reg1=/^[\u4e00-\u9fa5]+$/;
	var reg=/^1[3456789]\d{9}$/;
	patientName.bind("focus", function () {
		validateTip(patientName.next(), {"color": "#666666"}, "*此处为病人名称", false);
	}).bind("blur", function () {
		if (patientName.val() != null && patientName.val() != '') {
			if (!reg1.test(patientName.val())) {
				validateTip(patientName.next(), {"color": "red"}, "请输入中文", false);
			}else{
				validateTip(patientName.next(), {"color": "green"}, "*", true);
			}
		} else {
			validateTip(patientName.next(), {"color": "red"},  "** 病人名字不可为空", false);
		}
	});

	patientTel.bind("focus", function () {
		validateTip(patientTel.next(), {"color": "#666666"}, "*此处为病人的电话", false);
	}).bind("blur", function () {
		if (patientTel.val() != null && patientTel.val() != '' ) {
			if (!reg.test(patientTel.val())) {
				validateTip(patientTel.next(), {"color": "red"}, "请输入正确的电话号码", false);
			}else {
				validateTip(patientTel.next(), {"color": "green"}, "*", true);
			}
		} else {
			validateTip(patientTel.next(), {"color": "red"},  "** 病人电话不可为空", false);
		}
	});


});