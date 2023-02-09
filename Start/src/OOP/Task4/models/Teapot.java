package OOP.Task4.models;

public class Teapot extends Device{
    public Teapot(String name, String description) {
        super(name, description);
    }

    @Override
    public void Sound() {
        System.out.println("Is here sound of Teapot");
    }

    @Override
    public void Desc() {
        System.out.println(this.getDescription());
    }
}
