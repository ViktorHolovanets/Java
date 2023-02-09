package OOP_2.Task3.models;

import lombok.Data;

@Data
public class Country {
    private String name;
    private double landArea;
    private Integer population;

    public Country() {
        this("Ukraine",579.320	,43733762);
    }

    public Country(String name, double area, Integer population) {
        this.name = name;
        this.landArea = area;
        this.population = population;
    }
}
