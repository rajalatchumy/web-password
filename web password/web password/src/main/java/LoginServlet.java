import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String login = request.getParameter("login");
    String password = request.getParameter("password");

    if ("abc".equals(login) && "123".equals(password)) {
      response.getWriter().write("1"); // login successful
    } else {
      response.getWriter().write("0"); // invalid login or password
    }
  }
}
