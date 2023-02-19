package StreamApi.Task4.models;

import lombok.Data;

@Data
public class Project {
    private String Name;
    private int Year;
    private double Price;
    private  String Manufacturer;
   public Project(String name, int year, double price, String manufacturer ){
       this.Name=name;
       this.Year=year;
       this.Price=price;
       this.Manufacturer=manufacturer;
   }
}
