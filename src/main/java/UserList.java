import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/user/list")
public class UserList extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        getServletContext().getRequestDispatcher("/users/list.jsp")
//                .forward(request, response);                                  // nie widac listy, najpierw wysyla?

        UserDao userDao = new UserDao();
        request.setAttribute("users", userDao.findAll());

        response.getWriter().println("uzytkownik:");

        getServletContext().getRequestDispatcher("/users/list.jsp")
                .forward(request, response);
   }
}

