package OOP.Task5.models;

import OOP.Task5.models.baseClasses.MusicInstrument;

public class Violin extends MusicInstrument {

    public Violin(String name, String description, String history) {
        super(name, description,history);

    }

    public void Show() {
        System.out.println("The Violin");
        super.Show();
    }

    @Override
    public void Sound() {
        System.out.println("Sound of the Violin");
    }

    @Override
    public void Desc() {
        Show();
        System.out.println(this.getDescription());
    }

    @Override
    public void History() {
        System.out.println(this.getHistory());
    }
}
