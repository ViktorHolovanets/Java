package OOP.Task2.models;

import lombok.Data;

@Data
public class Crocodile extends Animal {
    private String color;

    public Crocodile() {
        super("Tiger");
        this.color = "green";
    }

    public Crocodile(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.printf("The voice of %s the crocodile", this.name);
    }

    @Override
    public void run() {
        System.out.printf("The crocodile %s crawls ", this.name);
    }
}
