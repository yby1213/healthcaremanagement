var regPatientName = null;
var regPatientSymptoms = null;
var regClinicName = null;
var regDoctorName = null;
$(function(){
	regPatientName = $("#regPatientName");
	regPatientSymptoms = $("#regPatientSymptoms");
	regClinicName = $("#regClinicName");
	regDoctorName = $("#regDoctorName");

	regPatientName.next().html("*");
	regPatientSymptoms.next().html("*");
	regClinicName.next().html("*");
	regDoctorName.next().html("*");
	var reg1=/^[\u4e00-\u9fa5]+$/;
	var reg=/^1[3456789]\d{9}$/;

	regPatientName.bind("focus", function () {
		validateTip(regPatientName.next(), {"color": "#666666"}, "* 此处为病人名字", false);
	}).bind("blur", function () {
		if (regPatientName.val() != null && regPatientName.val() != '') {
			if (!reg1.test(regPatientName.val())) {
				validateTip(regPatientName.next(), {"color": "red"}, "*请输入中文", false);
			}else {
				validateTip(regPatientName.next(), {"color": "green"}, "*", true);
			}
		} else {
			validateTip(regPatientName.next(), {"color": "red"},  "** 病人名字不可为空", false);
		}
	});

	regPatientSymptoms.bind("focus", function () {
		validateTip(regPatientSymptoms.next(), {"color": "#666666"}, "* 此处为病人病症", false);
	}).bind("blur", function () {
		if (regPatientSymptoms.val() != null && regPatientSymptoms.val() != '') {
			if (!reg1.test(regPatientSymptoms.val())) {
				validateTip(regPatientSymptoms.next(), {"color": "red"}, "*请输入中文", false);
			}else {
				validateTip(regPatientSymptoms.next(), {"color": "green"}, "*", true);
			}
		} else {
			validateTip(regPatientSymptoms.next(), {"color": "red"},  "** 病人病症不可为空", false);
		}
	});

	regClinicName.bind("focus", function () {
		validateTip(regClinicName.next(), {"color": "#666666"}, "* 此处为所挂诊室", false);
	}).bind("blur", function () {
		if (regClinicName.val() != null && regClinicName.val() != '') {
			if (!reg1.test(regClinicName.val())) {
				validateTip(regClinicName.next(), {"color": "red"}, "*请输入中文", false);
			}else {
				validateTip(regClinicName.next(), {"color": "green"}, "*", true);
			}
		} else {
			validateTip(regClinicName.next(), {"color": "red"},  "** 所挂诊室不可为空", false);
		}
	});

	regDoctorName.bind("focus", function () {
		validateTip(regDoctorName.next(), {"color": "#666666"}, "* 此处为所挂医生", false);
	}).bind("blur", function () {
		if (regDoctorName.val() != null && regDoctorName.val() != '') {
			if (!reg1.test(regDoctorName.val())) {
				validateTip(regDoctorName.next(), {"color": "red"}, "*请输入中文", false);
			}else {
				validateTip(regDoctorName.next(), {"color": "green"}, "*", true);
			}
		} else {
			validateTip(regDoctorName.next(), {"color": "red"},  "** 所挂医生不可为空", false);
		}
	});

	$("#add").click(function () {
		if(confirm("是否要增加"+$("#regPatientName").val().toString()+"此病人？")){
			$("#Form").submit();
		}
	})
});