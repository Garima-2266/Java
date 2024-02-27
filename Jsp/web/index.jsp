<%-- 
    Document   : Myjsp
    Created on : Feb 27, 2024, 1:04:51 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <body>
    <form action="/Jsp/ControllerServlet" method="post">
      Name:<input type="text" name="name" /><br />
      Password:<input type="password" name="password" /><br />
      <input type="submit" value="login" />
    </form>
  </body>
</html>

