var msg = '';
var msg1 ='';
var msg2 ='';
var msg3 ='';
var dia1 = $(".dia1").children('option');
var dia2 = $(".dia2").children('option');
var dia3 = $(".dia3").children('option');
for (let i = 1; i <dia1.length ; i++) {
	if(($("#diagnosis").val().indexOf(dia1.eq(i).val()))>=0){
		dia1.eq(i).attr("selected","selected");
		msg1=dia1.eq(i).val();
		break;
	}
}
for (let i = 1; i <dia2.length ; i++) {
	if(($("#diagnosis").val().indexOf(dia2.eq(i).val()))>=0){
		dia2.eq(i).attr("selected","selected");
		msg2=dia2.eq(i).val();
		break;
	}
}
for (let i = 1; i <dia3.length ; i++) {
	if(($("#diagnosis").val().indexOf(dia3.eq(i).val()))>=0){
		dia3.eq(i).attr("selected","selected");
		msg3=dia3.eq(i).val();
		break;
	}
}
function msgAdd(){
	if(msg1!=''&&msg2!=''&&msg3!=''){
		msg = msg1 + msg2 + msg3;
		// $("#diagnosis").val("");
/*		alert($("#diagnosis").val())*/
		$("#diagnosis").attr("value",msg);
	}
};


$(function(){
	$(".dia1").change(function () {
		msg1="";
		msg1 += $(this).children('option:selected').val();
		msgAdd();
	});
	$(".dia2").change(function () {
		msg2="";
		msg2 += $(this).children('option:selected').val();
		msgAdd();
	});
	$(".dia3").change(function () {
		msg3="";
		msg3 += $(this).children('option:selected').val();
		msgAdd();
	});
	$("#save").click(function () {
		if(confirm("是否要修改"+$("#regPatientName").val().toString()+"此病人？")){
			$("#Form").submit();
		}
	});
});
$(document).ready(function() {

});