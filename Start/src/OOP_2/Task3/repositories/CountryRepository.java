package OOP_2.Task3.repositories;

import OOP_2.Task3.interfaces.Stackable;
import OOP_2.Task3.models.Country;
import lombok.Data;

import java.util.ArrayList;
import java.util.Stack;

public class CountryRepository implements Stackable<Country> {
    private Stack<Country> countries;
    public CountryRepository(){
        countries=new Stack<>();
    }
    public void push(Country country){
        countries.push(country);
    }
    public Country pop(){
       return countries.pop();
    }
}
