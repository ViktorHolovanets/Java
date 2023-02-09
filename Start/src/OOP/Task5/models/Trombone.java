package OOP.Task5.models;

import OOP.Task5.models.baseClasses.MusicInstrument;

public class Trombone extends MusicInstrument {
    public Trombone(String name, String description, String history) {
        super(name, description, history);
    }

    @Override
    public void Sound() {
        System.out.println("Is here sound of Trombone");
    }

    @Override
    public void Desc() {
        System.out.println(this.getDescription());
    }

    @Override
    public void History() {
        System.out.println(this.getHistory());
    }
}
