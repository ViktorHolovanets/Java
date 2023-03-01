package Hibernate.services;

import Hibernate.models.Book;
import Hibernate.models.City;
import Hibernate.models.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class BookServices implements Runnable {

    SessionFactory sessionFactory = null;
    @Override
    public void run() {

        try {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(Book.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
        }catch (Exception ex){System.out.println(ex.getMessage());}
    }
    public Book findById(int id) {
        return sessionFactory.openSession().get(Book.class, id);
    }

    public void save(Book book) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
    }

    public void update(Book book) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(book);
        tx1.commit();
        session.close();
    }

    public void delete(Book book) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(book);
        tx1.commit();
        session.close();
    }
    public List<Book> findAll() {
        List<Book> books = (List<Book>)  sessionFactory.openSession().createQuery("From Book").list();
        books.stream().forEach(b->System.out.println(b));
        return books;
    }
}
