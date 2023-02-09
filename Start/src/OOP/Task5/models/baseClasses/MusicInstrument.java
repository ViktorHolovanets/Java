package OOP.Task5.models.baseClasses;

import lombok.Data;

@Data
public abstract class MusicInstrument {
    private String name;
    private String description;
    private String history;

    public MusicInstrument(String name, String description, String history) {
        this.name = name;
        this.description = description;
        this.history=history;
    }

    private MusicInstrument() {
    }
    public  abstract void Sound();
    public   void Show(){
        System.out.print(this.name);
    }
    public  abstract void Desc();
    public  abstract void History();
}
