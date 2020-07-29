$(function () {
    var flag = true;
    $("#historyBtn").click(function () {
        if(flag){
            $(".right_Info").show(200);
        }else{
            $(".right_Info").hide(200);
        }
        flag=!flag;
    });
});