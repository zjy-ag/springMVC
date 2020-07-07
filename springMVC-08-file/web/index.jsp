<%--
  Created by IntelliJ IDEA.
  User: zhujiayu
  Date: 2020/7/7
  Time: 7:43 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/upload2" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit" value="upload">
  </form>
  <a href="/download">点击下载（使用io流的方式）</a><br>
  <a href="${pageContext.request.contextPath}/statics/b.png">点击下载（放在static下的方式）</a>
  </body>
</html>
