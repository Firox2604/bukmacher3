package pl.bukmacher.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.bukmacher.Main;

import java.util.Optional;

public abstract class GenericRepository<T, ID> {

    public abstract Class<T> getClazz();

    public void save(T entity) {
        Transaction transaction = null;
        try (Session session = Main.getSession()) {
            transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
            transaction = null;
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public void update(T entity) {
        Transaction transaction = null;
        try (Session session = Main.getSession()) {
            transaction = session.beginTransaction();
            session.update(entity);
            transaction.commit();
            transaction = null;
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public Optional<T> finById(ID id) {
        try (Session session = Main.getSession()) {
            T entity = session.find(getClazz(), id);
            session.close();
            return Optional.ofNullable(entity);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}

