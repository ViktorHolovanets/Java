package OOP_2.Task3.repositories;

import OOP_2.Task3.interfaces.Stackable;
import OOP_2.Task3.models.Country;
import OOP_2.Task3.services.CountryService;

import javax.management.Query;
import java.util.ArrayDeque;
import java.util.Queue;

public class CountryQuequeRepositiry implements Stackable<Country> {
    private ArrayDeque<Country> countries;
    public  CountryQuequeRepositiry(){
        countries=new ArrayDeque<Country>();
    }
    @Override
    public void push(Country entity) {
        countries.push(entity);
    }

    @Override
    public Country pop() {
        return countries.pop();
    }
}
