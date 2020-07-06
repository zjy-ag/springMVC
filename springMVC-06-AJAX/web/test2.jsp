<%--
  Created by IntelliJ IDEA.
  User: zhujiayu
  Date: 2020/7/6
  Time: 12:59 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="static/js/JQuery-3.5.1.js"></script>
</head>
<body>
    <table>
        <tr>
            <td>name</td>
            <td>age</td>
            <td>gender</td>
        </tr>
        <tbody id="body">

        </tbody>
    </table>
</body>
<script>
    $(function () {
        //$.post(url, param(可省略), callback（success，error）)
        $.post('/a3', function (users) {
            let html = '';
            for (let i = 0; i < users.length; i++) {
                html += "<tr>" +
                        "<td>" + users[i].name + "<td>" +
                        "<td>" + users[i].age + "<td>" +
                        "<td>" + users[i].gender + "<td>" +
                        "<tr>";
            }
            $('#body').html(html);
        })
    })
</script>
</html>
