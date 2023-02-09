package OOP_2.Taks2.models;

import lombok.Data;

@Data
public class City {
    private String name;
    private String index;
    private Integer population;

    public City() {
        this("Mykolaiv","54000",470011);
    }

    public City(String name, String index, Integer population) {
        this.name = name;
        this.index = index;
        this.population = population;
    }
}
