import Hibernate.models.Book;
import Hibernate.services.BookServices;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        BookServices bookServices=new BookServices();
        bookServices.run();
        var book = new Book();
            book.setName("name");
            book.setDescription("name");
            book.setCountPage(15);
            book.setAuthor("author");
            book.setGenre("name");
            book.setYear(2023);
            book.setGenre("2023");
        bookServices.findAll();
//        SessionFactory sessionFactory = null;
//        try {
//            Configuration configuration = new Configuration().configure();
//            configuration.addAnnotatedClass(Book.class);
//            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//            sessionFactory = configuration.buildSessionFactory(builder.build());
//
//            Session session = sessionFactory.openSession();
//
//            Transaction transaction = session.beginTransaction();
//            var book = new Book();
//            book.setName("name1");
//            book.setDescription("name1");
//            book.setCountPage(15);
//            book.setAuthor("author1");
//            book.setGenre("name1");
//            book.setYear(20231);
//            book.setGenre("20231");
//
//            session.save(book);
//            session.save(book);
//            transaction.commit();
//
//
//            session.close();
//
//        } catch (Exception e) {
//            System.out.println("Исключение!" + e);
//        }

    }
}