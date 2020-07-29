var medicineNo = null;
var medicineName = null;
var medicineDisease = null;
var medicineDoses = null;
var addBtn = null;
var backBtn = null;

$(function(){
	medicineNo = $("#medicineNo");
	medicineName = $("#medicineName");
	medicineDisease = $("#medicineDisease");
	medicineDoses = $("#medicineDoses");
	addBtn = $("#add");
	backBtn = $("#back");
	//初始化的时候，要把所有的提示信息变为：* 以提示必填项，更灵活，不要写在页面上
	medicineNo.next().html("*");
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
				validateTip(medicineName.next(), {"color": "red"}, "*请输入中文", false);
			}else {
				validateTip(medicineName.next(), {"color": "green"}, "*", true);
			}
		} else {
			validateTip(medicineName.next(), {"color": "red"},  "** 药品名字不可为空", false);
		}
	});

	medicineDisease.bind("focus", function () {
		validateTip(medicineDisease.next(), {"color": "#666666"}, "* 此处为所治疾病", false);
	}).bind("blur", function () {
		if (medicineDisease.val() != null && medicineDisease.val() != '' ) {
			if (!reg1.test(medicineDisease.val())) {
				validateTip(medicineDisease.next(), {"color": "red"}, "*请输入中文", false);
			}else {
				validateTip(medicineDisease.next(), {"color": "green"}, "*", true);
			}
		} else {
			validateTip(medicineDisease.next(), {"color": "red"},  "** 所治疾病不可为空", false);
		}
	});

	
	addBtn.bind("click",function(){

			if(confirm("是否确认提交数据")){
				$("#Form").submit();

		}
	});

	backBtn.on("click",function(){
		if(referer != undefined 
			&& null != referer 
			&& "" != referer
			&& "null" != referer
			&& referer.length > 4){
		 window.location.href = referer;
		}else{
			history.back(-1);
		}
	});
});