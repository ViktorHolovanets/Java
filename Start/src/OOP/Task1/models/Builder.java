package OOP.Task1.models;

import OOP.Task1.models.BaseClasses.Human;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Builder extends Human  {
    private String rank;

    public Builder(String firstName, String lastName, Integer age, String rank) {
        super(firstName, lastName, age);
        this.rank = rank;
    }

    @Override
    public void run() {
        System.out.println("The work of a builder");
    }

}
