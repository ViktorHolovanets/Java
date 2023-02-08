package OOP.Task1.models;

import OOP.Task1.models.BaseClasses.Human;
import OOP.Task1.models.enums.TypesSailors;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Sailor extends Human {
    private TypesSailors type;

    public Sailor(String firstName, String lastName, Integer age, TypesSailors typesSailors) {
        super(firstName, lastName, age);
        this.type = typesSailors;
    }

    @Override
    public void run() {
        System.out.println("The work of a builder");
    }
}
