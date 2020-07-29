var userObj;
//用户管理页面上点击删除按钮弹出删除框(userlist.jsp)
function deleteUser(obj){
	$.ajax({
		type:"GET",
		url:"/patientDel",
		data:{method:"deluser",patientNo:obj.attr("patientNo")},
		dataType:"json",
		success:function(data){
			if(data.delResult == "true"){//删除成功：移除删除行
				/*cancleBtn();*/
				cancleBtn();
				obj.parents("tr").remove();
				location.href="/patientList";
				/*obj.parents("tr").remove();*/
			}else if(data.delResult == "false"){//删除失败
				//alert("对不起，删除用户【"+obj.attr("patient")+"】失败");
				changeDLGContent("对不起，删除用户【"+obj.attr("patientName")+"】失败");
			}else if(data.delResult == "notexist"){
				//alert("对不起，用户【"+obj.attr("username")+"】不存在");
				changeDLGContent("对不起，用户【"+obj.attr("patientName")+"】不存在");
			}
		},
		error:function(data){
			//alert("对不起，删除失败");
			changeDLGContent("对不起，删除失败");
		}
	});
}
function changeDLGContent(contentStr){
	var p = $(".removeMain").find("p");
	p.html(contentStr);
}
function cancleBtn(){
	$('.zhezhao').css('display', 'none');
	$('#removeUse').fadeOut();
}
function openYesOrNoDLG(){
	$('.zhezhao').css('display', 'block');
	$('#removeUse').fadeIn();
}
$(function(){
	$('#no').click(function () {
		cancleBtn();
	});

	$('#yes').click(function () {
		deleteUser(userObj);
	});
	$(".patientDel").on("click",function(){

		userObj = $(this);
		changeDLGContent("你确定删除【"+userObj.attr("patientName")+"】吗？");
		openYesOrNoDLG();
	});
	$(".patientMod").on("click", function () {
		var obj = $(this);
		window.location.href = "patientModInfo?method=modify&patientNo=" + obj.attr("patientNo");
	});
	$(".patientInfo").on("click", function () {
		//将被绑定的元素（a）转换成jquery对象，可以使用jquery方法
		var obj = $(this);
		window.location.href = "patientInfoMethod?method=view&patientNo=" + obj.attr("patientNo");
	});
});