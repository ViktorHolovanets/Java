package OOP.Task4.models;

public class Microwave extends Device {
    public Microwave(String name, String description) {
        super(name, description);
    }

    @Override
    public  void Sound() {
        System.out.println("bz-bz-bzzzzzzzzzzzzzz");
    }

    @Override
    public void Desc() {
        System.out.println("Description device microwave");
        System.out.println(this.getDescription());
    }
}
