package OOP.Task4.models;

import OOP.Task4.enums.Engine;

public class Car extends Device {
    private Engine typeEngine;

    public Car(String name, String description, Engine type) {
        super(name, description);
        this.typeEngine = type;
    }

    public void Show() {
        System.out.println("The device is a car");
        super.Show();
    }

    @Override
    public void Sound() {
        System.out.println("Sound of the car");
    }

    @Override
    public void Desc() {
        Show();
        System.out.println("\n"+typeEngine);
        System.out.println(this.getDescription());
    }
}
