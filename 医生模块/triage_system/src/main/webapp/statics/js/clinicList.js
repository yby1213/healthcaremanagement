var clinicNo;
function deleteDoc(clinicNo,obj) {
    $.ajax({
        type: "GET",
        url: "clinicDel",
        data: {clinicNo},
        dataType:"json",
        success: function (data) {
            if (data.delResult == "true") {//删除成功：移除删除行
                obj.parents("tr").remove();
            } else if (data.delResult == "false") {//删除失败
                confirm("删除失败");
            }
        },
        error: function (xhr, textStatus, errorThrown) {
            /*alert("进入error---");
            alert("状态码："+xhr.status);
            alert("状态:"+xhr.readyState);
            alert("错误信息:"+xhr.statusText );
            alert("返回响应信息："+xhr.responseText );//这里是详细的信息
            alert("请求状态："+textStatus);
            alert(errorThrown);
            alert("请求失败");*/
        }
    });
}
$(function() {
    $(".clinicInfo").on("click", function () {
        //将被绑定的元素（a）转换成jquery对象，可以使用jquery方法
        var obj = $(this);
        window.location.href = "clinicInfoMethod?method=view&clinicNo=" + obj.attr("clinicNo");
    });
    $(".clinicMod").on("click", function () {
        var inputPwd = prompt("请输入医务管理员密码密码");
        if(inputPwd == "1") {
            var obj = $(this);
            window.location.href = "clinicModInfo?method=modify&clinicNo=" + obj.attr("clinicNo");
        }else{
            alert("输入错误");
        }
    });
    $(".clinicDel").on("click",function () {
        var inputPwd = prompt("请输入医务管理员密码密码");
        if(inputPwd == "1"){
            var obj = $(this);
            clinicNo = $(".clinicDel").attr("clinicNo");
            if(confirm("是否确认删除数据")){
                deleteDoc(clinicNo,obj);
            }
        }else{
            alert("输入错误");
        }
    });
});
function clinicAdd(){
    var inputPwd = prompt("请输入医务管理员密码");
    if (inputPwd == "1") {
        location.href = "clinicAdd";
    } else {
        alert("输入错误");
    }
}