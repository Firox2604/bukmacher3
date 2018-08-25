package pl.bukmacher.servlet;

import pl.bukmacher.model.Event;

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

@WebServlet(urlPatterns = "/event")
public class EventServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Event> events = new ArrayList<>();
        events.add(new Event());
        events.add(new Event());
        events.add(new Event());
        events.add(new Event());

        ServletContext application = getServletContext();
        if (application.getAttribute("events")== null)
            application.setAttribute("events", events);


        RequestDispatcher dd = req.getRequestDispatcher("/index.jsp");
        dd.forward(req, resp);
    }
}

