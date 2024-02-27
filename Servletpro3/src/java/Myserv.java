
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Myserv extends HttpServlet {
    public void processRequest(HttpServletRequest request, HttpServletResponse response) {
        response.setIntHeader("Refresh", 1);
          // Set response content type
          response.setContentType("text/html");
          // Get current time
          Calendar calendar = new GregorianCalendar();
          String am_pm;
          int hour = calendar.get(Calendar.HOUR);
          int minute = calendar.get(Calendar.MINUTE);
          int second = calendar.get(Calendar.SECOND);
          if(calendar.get(Calendar.AM_PM) == 0)
               am_pm = "AM";
          else
               am_pm = "PM";

          String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
        PrintWriter out;
        try {
            
            out = response.getWriter();
            out.println(" <html>");
            out.println("<h1 align='center'>Auto Refresh Page</h1><hr>");
          out.println("<h3 align='center'>Current time: "+CT+"</h3>");

            out.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

