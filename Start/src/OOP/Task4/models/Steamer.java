package OOP.Task4.models;

public class Steamer extends Device{
    public Steamer(String name, String description) {
        super(name, description);
    }

    @Override
    public void Sound() {
        System.out.println("The sound is like a large Teapot");
    }

    @Override
    public void Desc() {
        System.out.println("Exclusive description");
        System.out.println(this.getDescription());
    }
}
