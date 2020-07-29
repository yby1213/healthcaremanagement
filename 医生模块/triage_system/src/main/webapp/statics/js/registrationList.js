var userObj;
//用户管理页面上点击删除按钮弹出删除框(userlist.jsp)
function deleteUser(obj){
    $.ajax({
        type:"GET",
        url:"/registrationDel",
        data:{method:"delreg",registrationNo:obj.attr("regNo")},
        dataType:"json",
        success:function(data){
            if(data.delResult == "true"){//删除成功：移除删除行
                /*cancleBtn();*/
                cancleBtn();
                obj.parents("tr").remove();
                location.href="/registrationList";
                /*obj.parents("tr").remove();*/
            }else if(data.delResult == "false"){//删除失败
                //alert("对不起，删除用户【"+obj.attr("patient")+"】失败");
                changeDLGContent("对不起，删除用户【"+obj.attr("regPatientName")+"】失败");
            }else if(data.delResult == "notexist"){
                //alert("对不起，用户【"+obj.attr("username")+"】不存在");
                changeDLGContent("对不起，用户【"+obj.attr("regPatientName")+"】不存在");
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

$(function() {
    $(".registrationInfo").on("click", function () {
        //将被绑定的元素（a）转换成jquery对象，可以使用jquery方法
        var obj = $(this);
        window.location.href = "registrationInfoMethod?method=view&regNo=" + obj.attr("regNo");
    });
    $('#no').click(function () {
        cancleBtn();
    });

    $('#yes').click(function () {
        deleteUser(userObj);
    });
    $(".registrationDel").on("click",function(){
        userObj = $(this);
        changeDLGContent("你确定删除【"+userObj.attr("regPatientName")+"】吗？");
        openYesOrNoDLG();
    });
    $(".registrationMod").on("click", function () {
        //将被绑定的元素（a）转换成jquery对象，可以使用jquery方法
        var obj = $(this);
        window.location.href = "registrationModList?regNo=" + obj.attr("regNo");
    });
    $("#searchself").on("click",function () {
        var selfName = $("#selfName").attr("selfName");
        if (selfName!=''&&selfName!=null){
            window.location.href = "registrationList?queryname=" + selfName;
        }else{
            if(confirm("请您先登录！")){
                window.location.href = "login";
            }
        }
    })
    $(".historyAdd").on("click", function () {
        var obj = $(this);
        if(confirm("确定添加字段到历史表中？")){
            $.ajax({
                type:"GET",
                url:"/historyAdd",
                data:{patientName:obj.attr("patientName"),historyDate:obj.attr("historyDate"),historyDiagnosis:obj.attr("historyDiagnosis")},
                dataType:"json",
                success:function(data){
                    if(data.addResult == "true"){//删除成功：移除删除行
                        /*cancleBtn();*/
                        location.href="/registrationList";
                        /*obj.parents("tr").remove();*/
                    }else if(data.addResult == "false"){//删除失败
                        alert("对不起，删除用户【"+obj.attr("patient")+"】失败");
/*                        changeDLGContent("对不起，添加历史【"+obj.attr("regPatientName")+"】失败");*/
                    }
                },
                error:function(data){
                    alert("对不起，添加失败");
/*                    changeDLGContent("对不起，添加失败");*/
                }
            });
        }
    })
});
