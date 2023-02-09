package OOP.Task5.models;

import OOP.Task5.models.baseClasses.MusicInstrument;

public class Ukulele extends MusicInstrument {
    public Ukulele(String name, String description,String history) {
        super(name, description,history);
    }

    @Override
    public void Sound() {
        System.out.println("The sound Ukulele");
    }

    @Override
    public void Desc() {
        System.out.println("Ukulele Ukulele Ukulele Ukulele Ukulele Ukulele Ukulele");
        System.out.println(this.getDescription());
    }

    @Override
    public void History() {
        System.out.println(this.getHistory());
    }
}
