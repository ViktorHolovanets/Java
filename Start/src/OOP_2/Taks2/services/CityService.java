package OOP_2.Taks2.services;


import OOP_2.Taks2.models.City;

public class CityService {
    public static void Show(City city){
        System.out.println("This is show of country");
        System.out.printf("Name: %s\n Index: %s\n Population: %d\n",city.getName(),city.getIndex(),city.getPopulation());
    }
    public  static void Store(City city){
        System.out.println("Storable of human");
    }
}
