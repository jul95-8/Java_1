import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/emailServlet")

public class EmailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String from = req.getParameter("from");
        String pass = "qwerty123";
        String to = req.getParameter("to");
        String subject = req.getParameter("subject");
        String text = req.getParameter("text");

        SendMail.send(from, pass, to, subject, text);
        PrintWriter out = resp.getWriter();
        out.println("Mail send successfully");
        System.out.println(from + ",   " + to + ",   " + pass + ",    " + subject + ",   " + text);
    }
}
