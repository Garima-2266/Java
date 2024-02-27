<%@ page session="true" %>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*,javax.servlet.http.*" %>

<%
    session.invalidate();
    response.sendRedirect("login.jsp");
%>
