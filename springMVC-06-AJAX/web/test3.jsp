<%--
  Created by IntelliJ IDEA.
  User: zhujiayu
  Date: 2020/7/6
  Time: 2:03 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="static/js/JQuery-3.5.1.js"></script>
</head>
<body>
<p>
    <span>username:</span>
    <input type="text" id="username" onblur="f1()">
    <span id="tback"></span>
</p>
<p>
    <span>password:</span>
    <input type="password" id="password" onblur="f2()">
    <span id="pback"></span>
</p>

</body>

<script>
    function f1 () {
        $.post(
            {
                url:'/a4',
                data:{'username':$('#username').val()},
                success:function (data) {
                    $('#tback').html(data);
                }
            }
        )
    }

</script>
</html>
