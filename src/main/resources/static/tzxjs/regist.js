$(document).ready(function(){
         $("#regist").click(function(){
           var formData = $("#regform").serializeArray(); //先进行序列化数组操作
           var userinfo = {};  //创建一个对象
           $.each(formData, function(n,v) {
                 userinfo[formData[n].name]=formData[n].value;  //循环数组，把数组的每一项都添加到对象
           });
            $.ajax({
              type: "POST",
              url: "./user",
              contentType: "application/json; charset=utf-8",
              data: JSON.stringify(userinfo),
              dataType: "json",
              success: function (data) {
                  if(data.resultCode == 0){
                      window.location.href="/login";
                  }
              },
              error: function (data) {
              }
           });
        });
});