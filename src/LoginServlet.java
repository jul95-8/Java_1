import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by Юлия on 24.02.2017.
 */

@WebServlet("/loginServlet")

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = "qwerty123";

        PrintWriter out = resp.getWriter();
        if(password.equals(req.getParameter("password"))) {
            Date date = new Date();
            req.setAttribute("date", date.toString());
            req.getRequestDispatcher("time.jsp").forward(req, resp);
            req.setAttribute("password", password);
        }
        else {
            resp.getWriter().println("<script type='text/javascript'>");
            resp.getWriter().println("alert('"+"Invalid password!"+"');");
            resp.getWriter().println("</script>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
