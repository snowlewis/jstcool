$(function () {
    $("#loginBtn").on("click", function () {
        var loginName = $("#loginNameInput").val();
        var password = $("#loginPasswordInput").val();

        alert(Global.basePath);
        
        var url = Global.basePath +  'service/login';
        var paras = {};
        paras['loginName'] = loginName;
        paras['password'] = password;
        $.post(url, paras, function (date) {
                alert(date.result);
            }
        );


    });
});