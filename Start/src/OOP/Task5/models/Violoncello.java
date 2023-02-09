package OOP.Task5.models;

import OOP.Task5.models.baseClasses.MusicInstrument;

public class Violoncello extends MusicInstrument {
    public Violoncello(String name, String description, String history) {
        super(name, description,history);
    }

    @Override
    public  void Sound() {
        System.out.println("sound of Ukulele");
    }

    @Override
    public void Desc() {
        System.out.println("Description Ukulele");
        System.out.println(this.getDescription());
    }

    @Override
    public void History() {
        System.out.println("History Ukulele");
        System.out.println(this.getHistory());
    }
}
