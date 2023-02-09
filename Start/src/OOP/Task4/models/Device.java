package OOP.Task4.models;

import lombok.Data;

@Data
public abstract class Device {
    private String name;
    private String description;

    public Device(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private Device() {
    }
    public  abstract void Sound();
    public   void Show(){
        System.out.print(this.name);
    }
    public  abstract void Desc();
}
