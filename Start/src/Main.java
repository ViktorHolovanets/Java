import Hibernate.models.Book;
import Hibernate.models.Country;
import Hibernate.services.BookServices;
import Hibernate.services.CountryServices;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        CountryServices bookServices=new CountryServices();
        bookServices.run();
       var l= bookServices.sameNames();
       var t=l.get(0);

//        for (Country c:l
//             ) {
            System.out.println(t);
//        }
    }
}