package pl.bukmacher.servlet;

import pl.bukmacher.model.AppUser;
import pl.bukmacher.model.MyEvent;
import pl.bukmacher.model.MyEventRepository;

import javax.persistence.Column;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@WebServlet(name = "ServletAddEvent", urlPatterns = "/doAddEvent")
public class ServletAddEvent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext application = getServletContext();
        String id = req.getParameter("id");

        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String date = req.getParameter("date");
        MyEvent myEvent = new MyEvent(name, location, date);
        MyEventRepository myEventRepository = new MyEventRepository();
        myEventRepository.save(myEvent);
    }
}
