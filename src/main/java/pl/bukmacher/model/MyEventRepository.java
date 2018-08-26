package pl.bukmacher.model;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pl.bukmacher.Main;

import java.util.ArrayList;
import java.util.List;

public class MyEventRepository extends GenericRepository<MyEvent, Integer> {

    @Override
    public Class<MyEvent> getClazz() {
        return MyEvent.class;
    }

    public List<MyEvent> findAll() {
        Transaction transaction = null;
        try (Session session = Main.getSession()) {
            String hqlQuery = "select e from event e";
            Query<MyEvent> query = session.createQuery(hqlQuery, MyEvent.class);
            List<MyEvent> list = query.list();
            session.close();
            return list;

        } finally {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
