<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*,javax.servlet.http.*" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
    // For demonstration purpose, let's assume username is "admin" and password is "admin"
    if ("admin".equals(username) && "admin".equals(password)) {
        session.setAttribute("username", username);
        response.sendRedirect("welcome.jsp");
    } else {
        out.println("<h2>Invalid username or password. Please try again.</h2>");
        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.include(request, response);
    }
%>
