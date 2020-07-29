var medicineObj;

//用户管理页面上点击删除按钮弹出删除框(userlist.jsp)
function deleteMedicine(obj){
	$.ajax({
		type:"GET",
		url:"medicineDel",
		data:{method:"delmedicine",mno:obj.attr("medicineNo")},
		dataType:"json",
		success:function(data){
			if(data.delResult == "true"){//删除成功：移除删除行
				cancleBtn();
				obj.parents("tr").remove();

			}else if(data.delResult == "false"){//删除失败
				//alert("对不起，删除用户【"+obj.attr("username")+"】失败");
				alert("666");
				changeDLGContent("对不起，删除药品【"+obj.attr("medicinename")+"】失败");
			}else if(data.delResult == "notexist"){
				//alert("对不起，用户【"+obj.attr("username")+"】不存在");
				alert("777");
				changeDLGContent("对不起，药品【"+obj.attr("medicinername")+"】不存在");
			}
		},
		error:function(data){
			//alert("对不起，删除失败");
			changeDLGContent("对不起，删除失败");
		}
	});
}

function openYesOrNoDLG(){
	$('.zhezhao').css('display', 'block');
	$('#removeUse').fadeIn();
}

function cancleBtn(){
	$('.zhezhao').css('display', 'none');
	$('#removeUse').fadeOut();
}
function changeDLGContent(contentStr){
	var p = $(".removeMain").find("p");
	p.html(contentStr);
}

$(function(){
	//通过jquery的class选择器（数组）
	//对每个class为viewUser的元素进行动作绑定（click）
	/**
	 * bind、live、delegate
	 * on
	 */
	$(".viewMedicine").on("click",function(){
		//将被绑定的元素（a）转换成jquery对象，可以使用jquery方法
		var obj = $(this);
		window.location.href="medicineview?method=view&mno="+ obj.attr("medicineno");
	});

	$(".modifyMedicine").on("click",function(){
		var obj = $(this);
		window.location.href="medicineModInfo?method=modify&medicineNo="+ obj.attr("medicineNo");
	});

	$('#no').click(function () {
		cancleBtn();
	});

	$('#yes').click(function () {
		deleteMedicine(medicineObj);
	});

	$(".deleteMedicine").on("click",function(){

		medicineObj = $(this);
		changeDLGContent("你确定删除【"+medicineObj.attr("medicineName")+"】吗？");
		openYesOrNoDLG();
	});

});