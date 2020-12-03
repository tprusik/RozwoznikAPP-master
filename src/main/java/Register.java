import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
        String repass = request.getParameter("repass");
        String email = request.getParameter("email");

        if (name == null) {
            if (pass == repass) {
                if (email == null) {
                    response.sendRedirect("welcome.jsp");
                } else {
                    response.sendRedirect("index.jsp");
                }
            }else {
                response.sendRedirect("index.jsp");
            }
        }else {
            response.sendRedirect("index.jsp");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
}