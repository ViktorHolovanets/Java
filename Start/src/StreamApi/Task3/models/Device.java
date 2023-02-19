package StreamApi.Task3.models;

import lombok.Data;

@Data
public class Device {
    private String Name;
    private int Year;
    private double Price;
    private  String Color;
    private String Type;
    public Device(String name, int year, double price, String color, String type){
        this.Name=name;
        this.Year=year;
        this.Price=price;
        this.Color=color;
        this.Type=type;
    }
}
