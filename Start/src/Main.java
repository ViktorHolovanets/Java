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
        bookServices.findAll();

    }
}