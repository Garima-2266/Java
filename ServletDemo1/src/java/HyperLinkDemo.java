/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class HyperLinkDemo extends HttpServlet {

    String msg="";
    PrintWriter out;
    public void init(ServletConfig config)throws ServletException{
        msg="hello world!MY first Servlet Program...";
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        out=response.getWriter();
        out.println("<h1>"+msg+"</h1>");
    }
    public void destroy()
    {
        out.close();
    }
    }
