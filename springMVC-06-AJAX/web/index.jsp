<%--
  Created by IntelliJ IDEA.
  User: zhujiayu
  Date: 2020/7/6
  Time: 9:46 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="static/js/JQuery-3.5.1.js"></script>
</head>
<body>
<input type="text" id="text" value="ajax" onblur="a2()">
</body>

<script>
    ${function a2() {
        $.post(
            {
                <%--url: "${pageContext.request.contextPath}/a2",--%>
                url: "/a2",
                data: {"name": $('#text').val()},
                success: function (data) {
                    alert(data);
                }
                // error:
            }
        )
    }
    }
</script>
</html>
