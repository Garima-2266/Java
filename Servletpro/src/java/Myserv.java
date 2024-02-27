import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class Myserv extends HttpServlet {
    public void processRequest(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out;
        try {
            out = response.getWriter();
            out.println(" <html>");
            out.println("<h1>The current date is: "+java.time.LocalDate.now()+"</h3>");
            out.println("<h1>And, the current time is: "+java.time.LocalTime.now()+"</h3>");

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
