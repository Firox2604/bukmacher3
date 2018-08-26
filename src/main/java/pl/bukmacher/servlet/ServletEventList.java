package pl.bukmacher.servlet;

import pl.bukmacher.model.MyEvent;
import pl.bukmacher.model.MyEventRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletEventList", urlPatterns = "/doList")
public class ServletEventList extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MyEventRepository myEventRepository = new MyEventRepository();
        List<MyEvent> repositoryList = myEventRepository.findAll();
        getServletContext().setAttribute("repoList", repositoryList);
    }
}
