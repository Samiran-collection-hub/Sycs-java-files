package mypack;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
out.println("<html><head><title>Servlet LoginServlet</title></head>");
String uname = request.getParameter("t1");
String upass = request.getParameter("t2");
if(uname.equals("admin") && upass.equals("12345"))
{
out.println("<body bgcolor=blue >");

out.println("<h1> Welcome !!! "+uname+"</h1>");
}
else
{
out.println("<body bgcolor=red >");
out.println("<h1> Login Fail !!! </h1>");
}
out.println("</body></html>");
}}
