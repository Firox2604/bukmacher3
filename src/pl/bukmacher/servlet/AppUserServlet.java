package pl.bukmacher.servlet;

import pl.bukmacher.model.AppUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/appUsers")
public class AppUserServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<AppUser> appUsers = new ArrayList<>();
        appUsers.add(new AppUser());
        appUsers.add(new AppUser());
        appUsers.add(new AppUser());
        appUsers.add(new AppUser());

        ServletContext application = getServletContext();
        if(application.getAttribute("appUsers") == null){
            application.setAttribute("appUsers", appUsers);
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }
}
