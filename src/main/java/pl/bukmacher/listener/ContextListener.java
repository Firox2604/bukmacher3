package pl.bukmacher.listener;

import pl.bukmacher.Main;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener  implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        Main.getSession().close();
    }

}
