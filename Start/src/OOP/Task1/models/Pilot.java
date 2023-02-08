package OOP.Task1.models;

import OOP.Task1.models.BaseClasses.Human;
import lombok.Getter;

public class Pilot extends Human {
    @Getter
    String type;
    public Pilot(String firstName, String lastName, Integer age, String type) {
        super(firstName, lastName, age);
        this.type=type;
    }

    @Override
    public void run() {
        System.out.println("The work of a Pilot");
    }
}
