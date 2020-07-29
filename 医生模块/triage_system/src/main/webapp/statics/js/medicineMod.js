var medicineName = null;
var medicineDisease = null;
var medicineDoses = null;
var modBtn = null;
$(function() {
	medicineName = $("#medicineName");
	medicineDisease = $("#medicineDisease");
	medicineDoses = $("#clinicDoc");
	modBtn = $("#mod");

	medicineName.next().html("*");
	medicineDisease.next().html("*");
	medicineDoses.next().html("*");
	var reg1=/^[\u4e00-\u9fa5]+$/;
	var reg=/^1[3456789]\d{9}$/;
	medicineName.bind("focus", function () {
		validateTip(medicineName.next(), {"color": "#666666"}, "* 此处为药品名称", false);
	}).bind("blur", function () {
		if (medicineName.val() != null && medicineName.val() != '') {
			if (!reg1.test(medicineName.val())) {
				validateTip(medicineName.next(), {"color": "red"}, "请输入中文", false);
			}else {
				validateTip(medicineName.next(), {"color": "green"}, "*", true);
			}
		} else {
			validateTip(medicineName.next(), {"color": "red"},  "** 药品名称不可为空", false);
		}
	});

	medicineDisease.bind("focus", function () {
		validateTip(medicineDisease.next(), {"color": "#666666"}, "* 此处为针对疾病", false);
	}).bind("blur", function () {
		if (medicineDisease.val() != null && medicineDisease.val() != '' ) {
			validateTip(medicineDisease.next(), {"color": "green"}, "*", true);
		} else {
			validateTip(medicineDisease.next(), {"color": "red"},  "** 针对疾病不可为空", false);
		}
	});

	medicineDoses.bind("focus", function () {
		validateTip(medicineDoses.next(), {"color": "#666666"}, "* 此处为药品剂量", false);
	}).bind("blur", function () {
		if (medicineDoses.val() != null && medicineDoses.val() != '' ) {
			validateTip(medicineDoses.next(), {"color": "green"}, "*", true);
		} else {
			validateTip(medicineDoses.next(), {"color": "red"},  "** 药品剂量不可为空", false);
		}
	});
	modBtn.bind("click",function(){
		if(confirm("是否确认提交数据")){
			$("#Form").submit();
		}
	});
});