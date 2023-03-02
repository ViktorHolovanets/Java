package Hibernate.services;

import Hibernate.models.Book;
import Hibernate.models.City;
import Hibernate.models.Country;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.HashSet;
import java.util.List;

public class CountryServices implements Runnable {
    SessionFactory sessionFactory = null;

    @Override
    public void run() {

        try {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(Country.class);
            configuration.addAnnotatedClass(City.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<City> getCitiesOfCountry(int id) {
        return sessionFactory.openSession().get(Country.class, id).getCities().stream().toList();
    }

    public List<Country> allCountry() {
        return sessionFactory.openSession().createQuery("From Country").list();
    }

    public List<City> getCitiesOfCountry() {
        Query query = sessionFactory.openSession().createQuery("SELECT C.capital FROM Country C");
        return query.list();
    }

    public City getCapital(int id) {
        Query query = sessionFactory.openSession().createQuery("SELECT C.capital FROM Country C WHERE C.id=:id").setParameter("id", id);
        return (City) query.list().get(0);
    }

    public List<Country> maxCountCities() {
        Query query = sessionFactory.openSession().createQuery("SELECT C FROM Country C ORDER BY C.cities.size desc limit 3");
        return query.list();
    }

    public List<Country> maxCountPopulations() {
        Query query = sessionFactory.openSession().createQuery("SELECT C FROM Country C ORDER BY C.population desc limit 3");
        return query.list();
    }

    public List<Country> minCountPopulations() {
        Query query = sessionFactory.openSession().createQuery("SELECT C FROM Country C ORDER BY C.population asc limit 3");
        return query.list();
    }

    public double avgPopulation(int id) {
        Query query = sessionFactory.openSession().createQuery("SELECT AVG(city.population) FROM Country C inner join C.cities city  where  C.id=:id").setParameter("id", id);
        return (double) query.list().get(0);
    }

    public List sameNames() {

        Query query = sessionFactory.openSession().createQuery("SELECT C.name as name,  count(C.population) as avg FROM City C group by C.name");
        List list = query.list();
        return query.list();
    }

    public List uniqueNames() {
        Query query = sessionFactory.openSession().createQuery("SELECT DISTINCT C.name,  count(c.population)FROM City C group by C.name");
        return query.list();
    }
}
