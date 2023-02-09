package OOP_2.Task3.services;


import OOP_2.Task3.interfaces.Stackable;
import OOP_2.Task3.models.Country;
import OOP_2.Task3.repositories.CountryQuequeRepositiry;
import OOP_2.Task3.repositories.CountryRepository;

public class CountryService implements Stackable<Country> {
    private Stackable<Country> countryRepository;

    public CountryService(){
        //countryRepository=new CountryRepository();
        countryRepository=new CountryQuequeRepositiry();
    }

    public  void Show(Country city){
        System.out.println("This is show of city");
        System.out.printf("Name: %s\n Area: %f\n Population: %d\n",city.getName(),city.getLandArea(),city.getPopulation());
    }
    public   void Store(Country city){
        System.out.println("Storable of human");
    }

    @Override
    public void push(Country entity) {
        countryRepository.push(entity);
    }

    @Override
    public Country pop() {
        return countryRepository.pop();
    }
}
