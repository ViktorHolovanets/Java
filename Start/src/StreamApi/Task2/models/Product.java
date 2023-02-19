package StreamApi.Task2.models;

import lombok.Data;

@Data
public class Product {
    private String Name;
    private  String Category;
    public  Product(String name, String category){
        this.Name=name;
        this.Category=category;
    }
    private Product(){}

}
