package pl.bukmacher.servlet;

import pl.bukmacher.model.AppUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletUser", urlPatterns = "/doUser")
public class SevletUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        AppUser appUser = new AppUser();
        String login2 = appUser.getLogin();
        String pass2 = appUser.getPassword();
        String login = request.getParameter("login");
        String pass = request.getParameter("password");

        if (login.equals(login2) && pass.equals(pass2)) {
            RequestDispatcher rs = request.getRequestDispatcher("restricted");
            rs.forward(request, response);
        } else {
            out.println("Username or Password incorrect");
            RequestDispatcher rs = request.getRequestDispatcher("index.html");
            rs.include(request, response);
        }
    }
}
