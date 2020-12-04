import Services.PasswordEncrypter;
import Services.UserDataService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "/dane" , urlPatterns = {"/dane"})
public class dane extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String sourname = request.getParameter("sourname");
        String address = request.getParameter("address");
        String zipCode = request.getParameter("zipCode");
        String city = request.getParameter("city");
        String telNumber = request.getParameter("telNumber");

        // obsługa danych nowych userów
        UserDataService userDataService = new UserDataService();

        userDataService.Create(name,sourname,address,zipCode,city,telNumber);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
