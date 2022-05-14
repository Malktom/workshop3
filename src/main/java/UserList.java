import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/user/list")
public class UserList extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/users/list.jsp")
                .forward(request, response);

        UserDao userDao = new UserDao();
        request.setAttribute("users", userDao.findAll());

        System.out.println(Arrays.toString(userDao.findAll()));
        response.getWriter().println("wypisanie z metody do GET"+request.getAttribute("users"));
        getServletContext().getRequestDispatcher("/users/list.jsp")
                .forward(request, response);
    }
}

